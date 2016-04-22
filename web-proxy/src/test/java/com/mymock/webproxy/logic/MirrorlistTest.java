/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.mymock.webproxy.BaseForTt;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
public class MirrorlistTest extends BaseForTt {

    @Test
    public void t() throws Exception {
        //@formatter:off
        mvc.perform(get("/mirrorlist/?release=6&arch=x86_64&repo=os"))
            .andExpect(status().is(200))
            .andDo(new ResultHandler() {
                    @Override
                    public void handle(MvcResult result) throws Exception {
                        String c = result.getResponse().getContentAsString();
                        for (String hn : result.getResponse().getHeaderNames()) {
                            printPair(hn, result.getResponse().getHeader(hn));
                        }
                        assertThat(c, containsString("/x86_64"));
                    }
                });
        //@formatter:o
    }
}
