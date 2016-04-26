/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.mymock.webproxy.BaseForTt;
import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public class HomeTest extends BaseForTt {

    @Autowired
    private DSLContext create;
    
    @Before
    public void bf() {
        create.delete(WPURL).execute();
    }
    
    @After
    public void af() {
        create.delete(WPURL).execute();
    }

    
    @Test
    public void t() throws Exception {
        mvc.perform(get("/?release=6&arch=x86_64&repo=os&host=mirrorlist.centos.org"))
        .andExpect(status().is(200))
        .andDo(new ResultHandler() {
                @Override
                public void handle(MvcResult result) throws Exception {
                    String c = result.getResponse().getContentAsString();
                    for (String hn : result.getResponse().getHeaderNames()) {
                        printPair(hn, result.getResponse().getHeader(hn));
                    }
                    assertThat(c, containsString("/x86_64"));
                    Integer i = new Integer(0);
                    i = create.select(DSL.count()).from(WPURL).fetchOne().into(i);
                    assertThat(i, equalTo(1));
                }
            });
        
        mvc.perform(get("/?release=6&arch=x86_64&repo=os&host=mirrorlist.centos.org"))
        .andExpect(status().is(200))
        .andDo(new ResultHandler() {
                @Override
                public void handle(MvcResult result) throws Exception {
                    String c = result.getResponse().getContentAsString();
                    for (String hn : result.getResponse().getHeaderNames()) {
                        printPair(hn, result.getResponse().getHeader(hn));
                    }
                    assertThat(c, containsString("/x86_64"));
                    Integer i = new Integer(0);
                    i = create.select(DSL.count()).from(WPURL).fetchOne().into(i);
                    assertThat(i, equalTo(1));
                }
            });
    }
}
