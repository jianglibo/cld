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

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.io.ByteStreams;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.domain.Wpheader;
import com.mymock.webproxy.domain.Wpurl;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.bytesprocessor.ToDbWithRl;
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
    
    @Autowired
    private DSLContext create;
    
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
            if (rl.isFileLike()) {
                rg.addProcessor(new ToHttpRespFromPartial(rl, resp, env));
            } else {
                //TODO partial bytes processor.
            }
            
        } else {
            if (rl.isFileLike()) {
                rg = new ApacheHcGetter(rl, new ToDiskWithRl(rl, env), new ToHttpResp(resp, env));
            } else {
                rg = new ApacheHcGetter(rl, new ToDbWithRl(rl, env), new ToHttpResp(resp, env));
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
    
    @Transactional
    public Wpurl findInDb(ResourceLocation rl) {
        //@formatter:off
        Result<WpurlRecord> urls = env.getCreate().selectFrom(WPURL).fetch();
        int num = urls.size();
        
        create.insertInto(WPURL, WPURL.ADDRESS).values("abc").execute();
        
        urls = env.getCreate().fetch(WPURL);
        num = urls.size();
        create.transaction(configuration -> {
            DSL.using(configuration).insertInto(WPURL, WPURL.ADDRESS).values("hello").returning().fetchOne();  
        });
        
        
        Result<Record> result = env.getCreate().select()
            .from(WPURL)
            .join(WPHEADER).on(WPURL.ID.eq(WPHEADER.URL_ID))
            .where(WPURL.ADDRESS.eq(rl.getUrlString()))
            .fetch();
        
        result.forEach(r -> {
            System.out.println(r.getValue(WPURL.ID));
        });
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