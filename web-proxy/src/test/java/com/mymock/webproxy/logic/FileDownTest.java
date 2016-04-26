/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;

import org.apache.http.Header;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.bytesprocessor.ToDiskWithRl;
import com.mymock.webproxy.logic.resourcegetter.ApacheHcGetter;
import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;
import com.mymock.webproxy.util.CompositeEnv;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
public class FileDownTest extends BaseForTt {

    @Autowired
    private CompositeEnv env;

    @Test
    public void t() throws Exception {
        
        String fpath = "centos/7/os/x86_64/Packages/ModemManager-vala-1.1.0-8.git20130913.el7.x86_64.rpm";
        
        String urlString = "http://mirrors.aliyun.com/" + fpath;

        ResourceLocation rl = new ResourceLocation(new URL(urlString));

        try {
            ResourceGetter rg = new ApacheHcGetter(rl, new ToDiskWithRl(rl, env));
            rg.play();
            for (Header hd : rg.getHeaders()) {
                printPair(hd.getName(), hd.getValue());
            }
            assertTrue("file should be in cache path.",
                    Files.exists(appConfig.getCachePath().resolve(fpath)));
            assertFalse("file should not be in partial path.",
                    Files.exists(appConfig.getParitalPath().resolve(fpath)));
        } catch (ResourceGetterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
