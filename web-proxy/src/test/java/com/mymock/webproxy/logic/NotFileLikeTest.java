/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import static org.hamcrest.Matchers.equalTo;
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
public class NotFileLikeTest extends BaseForTt {

    @Autowired
    private DSLContext create;
    
    private AtomicInteger concurrent = new AtomicInteger(0);
    
    private AtomicInteger stoped = new AtomicInteger(0);
    
    private AtomicInteger hasContentLength = new AtomicInteger(0);

    private String url = "/was5/web/search?word=abc&searchword=abc&StringEncoding=gbk&channelid=289923&x=0&y=0";
    
    private String host = "search.fh.gov.cn";
    
    @Autowired
    private HitStatus hitStatus;

    @Before
    public void bf() {
        create.delete(Wpurl.WPURL).execute();
    }


//    http://search.fh.gov.cn/was5/web/search?word=abc&searchword=abc&StringEncoding=gbk&channelid=289923&x=0&y=0 

    private void q(Thread main) throws Exception {
        //@formatter:off
        mvc.perform(get(url)
                .header(appConfig.getForwardHeader(), host))
        .andExpect(status().is2xxSuccessful())
        .andDo(new ResultHandler() {
            @Override
            public void handle(MvcResult result) throws Exception {
                long fl = result.getResponse().getContentLengthLong();
                if (fl > 0) {
                    hasContentLength.incrementAndGet();
                }
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
                if (fl > 0) {
                    hasContentLength.incrementAndGet();
                }
                com.mymock.webproxy.domain.Wpurl wpurl = create.selectFrom(Wpurl.WPURL).fetchOne().into(com.mymock.webproxy.domain.Wpurl.class);
                assertTrue(wpurl.getAddress().endsWith(url));
            }
        });
        
        if (stoped.incrementAndGet() == concurrent.get()) {
            assertThat(hasContentLength.get(), equalTo(concurrent.get() * 2 - 1));
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
