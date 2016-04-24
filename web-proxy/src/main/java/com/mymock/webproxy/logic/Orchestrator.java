package com.mymock.webproxy.logic;

import static com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER;
import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.io.ByteStreams;
import com.mymock.webproxy.domain.Wpheader;
import com.mymock.webproxy.domain.Wpurl;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.bytesprocessor.ToDiskFile;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpServletResponse;
import com.mymock.webproxy.logic.bytesprocessor.ToPartialHttpServletResponse;
import com.mymock.webproxy.util.CompositeEnv;
import com.mymock.webproxy.util.MyUtil;

/**
 * 每当收到一个请求，发送OriginUrl到这里。必须知道哪些请求已经在处理中，哪些已经结束。
 * @author jianglibo@gmail.com
 *
 */

@Component
public class Orchestrator {
    
    private ReentrantLock lock = new ReentrantLock();
    
    private Map<OriginUrl, ResourceGetter> processingUrls = new HashMap<>(); 
    
    @Autowired
    private CompositeEnv env;
    
    public void participate(OriginUrl ou, HttpServletResponse resp) throws ResourceGetterException, IOException, BytesProcessorException {
        //find item by ou form db.
        //if exists, no need for resourcegetter.
        //else 
        
        Wpurl wpurl = findInDb(ou);
        
        if (wpurl != null) {
            wpurl.getHeaders().stream().forEach(hd -> {
                resp.addHeader(hd.getHeaderName(), hd.getHeaderValue());
            });
            OutputStream os = resp.getOutputStream();
            if (wpurl.getContent() == null) { //is disk file
                Path p = MyUtil.getDiskPath(env.getAppConfig().getCachePath(), wpurl.getAddress());
                InputStream is = Files.newInputStream(p);
                ByteStreams.copy(is, os);
                is.close();
            } else {
                ByteStreams.copy(new ByteArrayInputStream(wpurl.getContent()), os);
            }
            os.flush();
            os.close();
            return;
        }
        
        ResourceGetter rg = getrg(ou);
        
        if (rg != null) {
            rg.addProcessor(new ToPartialHttpServletResponse(ou, resp, env));
        } else {
            
            if (ou.isFileLike()) {
                rg = new ResourceGetter(ou, new ToDiskFile(ou, env), new ToHttpServletResponse(ou, resp, env));
            }
            switch (rg.play()) {
            case ResourceGetter.RG_NOT_OK:
                break;
            case ResourceGetter.RG_OK:
                break;
            default:
                break;
            }
        }
    }
    
    private ResourceGetter getrg(OriginUrl ou) {
        lock.lock();
        try {
            return processingUrls.get(ou);
        } finally {
          lock.unlock();
        }
    }
    
    private Wpurl findInDb(OriginUrl ou) {
        //@formatter:off
        Result<Record> result = env.getCreate().select()
            .from(WPURL)
            .join(WPHEADER).on(WPURL.ID.eq(WPHEADER.URL_ID))
            .where(WPURL.ADDRESS.eq(ou.getUrlString()))
            .fetch();
        
        if (result.size() == 0) {
            return null;
        }
        
        Wpurl wpu = result.get(0).into(Wpurl.class);
        List<Wpheader> headers = result.stream().map(r -> {
           return r.into(Wpheader.class); 
        }).collect(Collectors.toList());
        
        wpu.setHeaders(headers);
        
        return wpu;
        //@formatter:on
    }
}
