package com.mymock.webproxy.logic.cachedprocessor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.io.ByteStreams;
import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.domain.Wpurl;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.HitStatus;
import com.mymock.webproxy.logic.RequestingLock;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.bytesprocessor.ToDiskWithRl;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpResp;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpRespFromPartial;
import com.mymock.webproxy.logic.resourcegetter.ApacheHcGetter;
import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;
import com.mymock.webproxy.util.CompositeEnv;
import com.mymock.webproxy.util.HeaderUtil;
import com.mymock.webproxy.util.MyUtil;

@Component
public class DiskToResp implements CachedProcessor {

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private CompositeEnv env;

    @Autowired
    private RequestingLock rLock;

    @Autowired
    private HitStatus hitStatus;

    private void sendToClient(HttpServletResponse resp, Wpurl wpurl) throws IOException {
        Path p = MyUtil.getDiskPath(appConfig.getCachePath(), wpurl.getAddress());
        if (Files.exists(p)) {
            wpurl.getHeaders().stream().forEach(hd -> {
                if (!(HeaderUtil.skip(hd.getHeaderName()) || HeaderUtil.isTransferEncoding(hd.getHeaderName()))) {
                    resp.setHeader(hd.getHeaderName(), hd.getHeaderValue());
                }
            });

            resp.setContentLengthLong(Files.size(p));

            OutputStream os = resp.getOutputStream();
            InputStream is = Files.newInputStream(p);
            ByteStreams.copy(is, os);
            is.close();
            os.flush();
            os.close();
        } else {
            env.getUrlRepo().delete(wpurl.getId());
            resp.sendRedirect(wpurl.getAddress());
        }
    }

    @Override
    public boolean start(HttpServletResponse resp, ResourceLocation rl, ReentrantLock urlLock)
            throws IOException, ResourceGetterException, URISyntaxException, BytesProcessorException {
        if (!rl.isFileLike()) {
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
        if (rg == null) { // not in processing state.
            rg = new ApacheHcGetter(rl, hitStatus, new ToDiskWithRl(rl, env), new ToHttpResp(resp, env));
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
            urlLock.unlock();
            rg.addProcessor(new ToHttpRespFromPartial(rl, resp, env));
            return true;
        }
    }
}
