package com.mymock.webproxy.logic.cachedprocessor;

import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.domain.Wpurl;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.HitStatus;
import com.mymock.webproxy.logic.RequestingLock;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.bytesprocessor.ToDbWithRl;
import com.mymock.webproxy.logic.resourcegetter.ApacheHcGetter;
import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;
import com.mymock.webproxy.util.CompositeEnv;

/**
 * 
 * @author jianglibo@gmail.com
 *
 */
@Component
public class MirrorListHandler implements CachedProcessor {

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private RequestingLock rLock;

    @Autowired
    private CompositeEnv env;

    @Autowired
    private HitStatus hitStatus;

    private boolean isMirrorListReq(ResourceLocation rl) {
        return "mirrorlist.centos.org".equalsIgnoreCase(rl.getHost());
    }

    private void sendToClient(HttpServletResponse resp, Wpurl wpurl) throws IOException {
        String mlist = new String(wpurl.getContent());
        String oneline = mlist.split("\n")[0];
        int thirdSlash = oneline.indexOf('/', 9);
        String suffix = oneline.substring(thirdSlash);
        String fullUrl = appConfig.getFavoriteMirror() + suffix;
        int length = fullUrl.getBytes().length;
        resp.setContentLength(length);
        Writer out = resp.getWriter();
        out.write(fullUrl);
        out.flush();
        out.close();
    }

    public boolean start(HttpServletResponse resp, ResourceLocation rl, ReentrantLock urlLock) throws IOException, ResourceGetterException, URISyntaxException {
        if (!isMirrorListReq(rl)) {
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
            rg = new ApacheHcGetter(rl, hitStatus, new ToDbWithRl(rl, env));
            rLock.addRg(rg, rl);
            urlLock.unlock();
            rg.play();
            sendToClient(resp, env.getUrlRepo().findByAddress(rl.getUrlString()));
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
