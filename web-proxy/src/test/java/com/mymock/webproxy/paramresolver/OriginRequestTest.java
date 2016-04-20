/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.paramresolver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.mymock.webproxy.BaseForTt;

/**
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
public class OriginRequestTest extends BaseForTt {

    private String s() {
        return null;
    }

    @Test
    public void appendNull() {
        StringBuffer sb = new StringBuffer();
        sb.append(s());

        assertThat(sb.toString(), equalTo("null"));
    }

    @Test
    public void aurl() throws Exception {
        //@formatter:off
        mvc.perform(get("/"))
            .andExpect(status().is(200))
            .andDo(new ResultHandler() {
                    @Override
                    public void handle(MvcResult result) throws Exception {
                        String c = result.getResponse().getContentAsString();
                        assertThat(c, is("Hello World!"));
                    }
                });
        //@formatter:on
    }
}
