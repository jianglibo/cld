package com.mymock.webproxy.logic;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.cachedprocessor.CachedProcessor;
import com.mymock.webproxy.logic.cachedprocessor.CachedProcessors;

/**
 * 每当收到一个请求，发送OriginUrl到这里。必须知道哪些请求已经在处理中，哪些已经结束。
 * 
 * @author jianglibo@gmail.com
 *
 */

@Component
public class Orchestrator {

    @Autowired
    private CachedProcessors cachedProcessors;

    @Autowired
    private RequestingLock rLock;

    public void participate(ResourceLocation rl, HttpServletResponse resp)
            throws ResourceGetterException, IOException, BytesProcessorException, URISyntaxException {

        ReentrantLock urlLock = rLock.getRlLockOrSet(rl);

        urlLock.lock();
        try {
            for (CachedProcessor cp : cachedProcessors) {
                if (cp.start(resp, rl, urlLock)) {
                    return;
                }
            }
        } finally {
            if (urlLock.getHoldCount() == 1) {
                urlLock.unlock();
            }
        }
    }
}
