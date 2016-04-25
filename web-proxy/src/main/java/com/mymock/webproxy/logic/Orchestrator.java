package com.mymock.webproxy.logic;

import static com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER;
import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
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
import com.mymock.webproxy.logic.bytesprocessor.ToDiskWithRl;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpResp;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpRespFromPartial;
import com.mymock.webproxy.logic.resourcegetter.ApacheHcGetter;
import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;
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
    
    private Map<ResourceLocation, ResourceGetter> processingUrls = new HashMap<>(); 
    
    @Autowired
    private CompositeEnv env;
    
    public void participate(ResourceLocation rl, HttpServletResponse resp) throws ResourceGetterException, IOException, BytesProcessorException, URISyntaxException {
        //find item by ou form db.
        //if exists, no need for resourcegetter.
        //else 
        
        Wpurl wpurl = findInDb(rl);
        
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
        
        ResourceGetter rg = getrg(rl);
        
        if (rg != null) {
            rg.addProcessor(new ToHttpRespFromPartial(rl, resp, env));
        } else {
            
            if (rl.isFileLike()) {
                rg = new ApacheHcGetter(rl, new ToDiskWithRl(rl, env), new ToHttpResp(resp, env));
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
    
    private ResourceGetter getrg(ResourceLocation ou) {
        lock.lock();
        try {
            return processingUrls.get(ou);
        } finally {
          lock.unlock();
        }
    }
    
    private Wpurl findInDb(ResourceLocation rl) {
        //@formatter:off
        Result<Record> result = env.getCreate().select()
            .from(WPURL)
            .join(WPHEADER).on(WPURL.ID.eq(WPHEADER.URL_ID))
            .where(WPURL.ADDRESS.eq(rl.getUrlString()))
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
