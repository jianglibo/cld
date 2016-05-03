package com.mymock.webproxy.logic.cachedprocessor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.io.ByteStreams;
import com.mymock.webproxy.domain.Wpurl;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.HitStatus;
import com.mymock.webproxy.logic.RequestingLock;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.bytesprocessor.ToDbWithRl;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpResp;
import com.mymock.webproxy.logic.resourcegetter.ApacheHcGetter;
import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;
import com.mymock.webproxy.util.CompositeEnv;
import com.mymock.webproxy.util.HeaderUtil;

@Component
public class DbToResp implements CachedProcessor {
    
    private static final Logger logger = LoggerFactory.getLogger(DbToResp.class);

    @Autowired
    private CompositeEnv env;

    @Autowired
    private RequestingLock rLock;

    @Autowired
    private HitStatus hitStatus;

    private void sendToClient(HttpServletResponse resp, Wpurl wpurl) throws IOException {
        resp.setContentLength(wpurl.getContent().length);
        wpurl.getHeaders().stream().forEach(hd -> {
            if (!(HeaderUtil.skip(hd.getHeaderName()) || HeaderUtil.isTransferEncoding(hd.getHeaderName()))) {
                resp.setHeader(hd.getHeaderName(), hd.getHeaderValue());
            }
        });
        OutputStream os = resp.getOutputStream();
        ByteStreams.copy(new ByteArrayInputStream(wpurl.getContent()), os);
        os.flush();
        os.close();
    }

    @Override
    public boolean start(HttpServletResponse resp, ResourceLocation rl, ReentrantLock urlLock)
            throws IOException, ResourceGetterException, URISyntaxException, BytesProcessorException {
        if (rl.isFileLike()) {
            return false;
        }
        
        hitStatus.getStartCalled().incrementAndGet();
        Wpurl wpurl = env.getUrlRepo().findByAddress(rl.getUrlString());

        if (wpurl != null) {
            urlLock.unlock();
            sendToClient(resp, wpurl);
            return true;
        }

        ResourceGetter rg = rLock.getRg(rl);
        
        if (rg == null) {
            logger.info("create ApacheHcGetter for: {}", rl.getUrlString());
            rg = new ApacheHcGetter(rl, hitStatus, new ToDbWithRl(rl, env), new ToHttpResp(resp, env));
            rLock.addRg(rg, rl);
            urlLock.unlock();
            rg.play();
            urlLock.lock();
            try {
                rLock.rmRg(rl);
            } finally {
                urlLock.unlock();
            }
            return true;
        } else {
            urlLock.unlock(); // never block.
            Wpurl wpurln = null;
            while ((wpurln = env.getUrlRepo().findByAddress(rl.getUrlString())) == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            sendToClient(resp, wpurln);
            return true;
        }
    }
}
