/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
public class MirrorListTest extends BaseForTt {

    @Autowired
    private DSLContext create;
    
    private AtomicInteger concurrent = new AtomicInteger(0);
    
    private AtomicInteger stoped = new AtomicInteger(0);

    private String url = "/?release=7&arch=x86_64&repo=extras";
    
    private String host = "mirrorlist.centos.org";
    
    @Autowired
    private HitStatus hitStatus;

    @Before
    public void bf() {
        concurrent.set(0);
        stoped.set(0);
        hitStatus.reset();
        create.delete(Wpurl.WPURL).execute();
    }

    // http://mirrorlist.centos.org/?release=7&arch=x86_64&repo=extras

    private void q(Thread main) throws Exception {
        //@formatter:off
        mvc.perform(get(url)
                .header(appConfig.getForwardHeader(), host))
        .andExpect(status().is2xxSuccessful())
        .andDo(new ResultHandler() {
            @Override
            public void handle(MvcResult result) throws Exception {
                long fl = result.getResponse().getContentLengthLong();
                String content = result.getResponse().getContentAsString();
                assertThat(content, equalTo("http://mirrors.aliyun.com/centos/7.2.1511/extras/x86_64/"));
                assertThat(fl, greaterThan(0L));
                com.mymock.webproxy.domain.Wpurl wpurl = create.selectFrom(Wpurl.WPURL).fetchOne().into(com.mymock.webproxy.domain.Wpurl.class);
                assertTrue(wpurl.getAddress().endsWith(url));
            }
        });
        //@formatter:on

        //@formatter:off
        mvc.perform(get(url)
                .header(appConfig.getForwardHeader(), host))
        .andExpect(status().is2xxSuccessful())
        .andDo(new ResultHandler() {
            @Override
            public void handle(MvcResult result) throws Exception {
                long fl = result.getResponse().getContentLengthLong();
                assertThat(fl, greaterThan(0L));
                com.mymock.webproxy.domain.Wpurl wpurl = create.selectFrom(Wpurl.WPURL).fetchOne().into(com.mymock.webproxy.domain.Wpurl.class);
                assertTrue(wpurl.getAddress().endsWith(url));
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
                    q(main);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return t;
    }


    @Test
    public void multipleQ() {

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
