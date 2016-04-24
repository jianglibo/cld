/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.http.Header;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.bytesprocessor.ToDiskFile;
import com.mymock.webproxy.util.CompositeEnv;
import com.mymock.webproxy.util.MyUtil;

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

        Thread main = Thread.currentThread();
        String urlString = "http://mirrors.aliyun.com/centos/7/os/x86_64/Packages/centos-logos-70.0.6-3.el7.centos.noarch.rpm";
        
        OriginUrl ou = mock(OriginUrl.class);
        when(ou.getDiskPath(appConfig.getParitalPath())).thenReturn(MyUtil.getDiskPath(appConfig.getParitalPath(),urlString));
        when(ou.getUrlString()).thenReturn(urlString);
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ResourceGetter rg = new ResourceGetter(ou, new ToDiskFile(ou, env));
                    rg.play();
                    for(Header hd : rg.getHeaders()) {
                        printPair(hd.getName(), hd.getValue());
                    }
                    main.interrupt();
                } catch (ResourceGetterException e) {
                    main.interrupt();
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        
        t1.run();
        
//        Timer timer = new Timer();
//        
//        timer.schedule(new TimerTask() {
//            
//            @Override
//            public void run() {
//                try {
//                    System.out.println(Files.size(dstFile));
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, 100, 1000);
        
//        Thread.sleep(1000*100000);

    }
}
