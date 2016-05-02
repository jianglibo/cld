/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.jooq.DSLContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.google.common.collect.Lists;
import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.db.public_.tables.Wpurl;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
public class FileLikTest extends BaseForTt {
    
    @Autowired
    private DSLContext create;
    
    private AtomicInteger concurrent = new AtomicInteger(0);
    
    private AtomicInteger stoped = new AtomicInteger(0);
    
    @Autowired
    private HitStatus hitStatus;
    
    @Before
    public void bf() {
        create.delete(Wpurl.WPURL).execute();
    }
    
    private void f(Thread main) throws Exception {
        String furl = "/centos/7/os/x86_64/Packages/ModemManager-vala-1.1.0-8.git20130913.el7.x86_64.rpm";
        
        //@formatter:off
        mvc.perform(get(furl)
                .header(appConfig.getForwardHeader(), "mirrors.aliyun.com"))
        .andExpect(status().is2xxSuccessful())
        .andDo(new ResultHandler() {
            
            @Override
            public void handle(MvcResult result) throws Exception {
                long fl = result.getResponse().getContentAsByteArray().length;
                Path fp = appConfig.getCachePath().resolve(furl.substring(1));
                printme(fp.toString());
//                Thread.sleep(1000);
//                assertThat(fl, equalTo(Files.size(fp)));
            }
        });
        //@formatter:on
        
        // this time wpurl already in db.
        //@formatter:off
        mvc.perform(get(furl)
                .header(appConfig.getForwardHeader(), "mirrors.aliyun.com"))
        .andExpect(status().is2xxSuccessful())
        .andDo(new ResultHandler() {
            
            @Override
            public void handle(MvcResult result) throws Exception {
                long fl = result.getResponse().getContentAsByteArray().length;
                Path fp = appConfig.getCachePath().resolve(furl.substring(1));
//                assertThat(fl, equalTo(Files.size(fp)));
            }
        });
        
        if (stoped.incrementAndGet() == concurrent.get()) {
            assertThat(hitStatus.getHttpClientReqCount().get(), equalTo(1));
            assertThat(hitStatus.getStartCalled().get() / 2, equalTo(concurrent.get()));
            main.interrupt();
        }
        //@formatter:on
    }
    
    private Thread ct(Thread main) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    f(main);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return t;
    }

    @Test
    public void t() throws Exception {
        List<Thread> ts = Lists.newArrayList();
        Thread main = Thread.currentThread();
        stoped.set(0);
        concurrent.set(10);
        
        for (int i = 0; i < concurrent.get(); i++) {
            Thread t = ct(main);
            ts.add(t);
            t.start();
        }
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
        }
    }
}
