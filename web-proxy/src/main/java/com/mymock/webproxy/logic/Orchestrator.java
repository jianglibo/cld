package com.mymock.webproxy.logic;

import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletResponse;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.db.public_.Keys;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.bytesprocessor.BytesProcessor;
import com.mymock.webproxy.logic.bytesprocessor.ToDiskFile;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpServletResponse;
import com.mymock.webproxy.logic.bytesprocessor.ToPartialHttpServletResponse;
import com.mymock.webproxy.util.CompositeEnv;

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
    
    private WpurlRecord findInDb(OriginUrl ou) {
        //@formatter:off
        WpurlRecord ur =  env.getCreate().selectFrom(WPURL).where(WPURL.ADDRESS.equal(ou.getUrlString())).fetchOne();
        WpheaderRecord[] hrs = ur.fetchChildren(Keys.FK_HEADER_URL).toArray(new WpheaderRecord[]{});
        return ur;
        //@formatter:on
    }
}
