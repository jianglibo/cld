/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.util.MyUtil;

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
    public void setT() throws MalformedURLException {
        Set<ResourceLocation> oset = new HashSet<>();
        ResourceLocation ou = new ResourceLocation(new URL("http://www.xx.com"));
        ResourceLocation ou1 = new ResourceLocation(new URL("http://www.xx.com"));
        oset.add(ou);
        oset.add(ou1);
        assertThat(oset.size(), equalTo(1));
        
        assertTrue(oset.contains(new ResourceLocation(new URL("http://www.xx.com"))));
    }
    
    @Test
    public void ouAsMapkey() throws MalformedURLException {
        Map<ResourceLocation, Integer> m = new HashMap<>();
        ResourceLocation ou = new ResourceLocation(new URL("http://www.xx.com"));
        ResourceLocation ou1 = new ResourceLocation(new URL("http://www.xx.com"));
        m.put(ou, 10);
        assertThat(m.get(ou1), equalTo(10));
    }

    @Test
    public void appendNull() {
        StringBuffer sb = new StringBuffer();
        sb.append(s());

        assertThat(sb.toString(), equalTo("null"));
    }
    
    @Test
    public void splitOne() {
        String[] ss = "/".split("/");
        assertThat(ss.length, equalTo(0));
    }
    
    @Test
    public void url() throws MalformedURLException {
        String h = "http://www.my-mock.com/?a=x";
        URL url = new URL(h);
        URL url1 = MyUtil.changeURLHost(url, "xx.xx");
        assertThat(url1.toString(), equalTo("http://xx.xx/?a=x"));
        
        h = "http://www.my-mock.com?a=x";
        url = new URL(h);
        url1 = MyUtil.changeURLHost(url, "xx.xx");
        assertThat(url1.toString(), equalTo("http://xx.xx?a=x"));
        
        h = "http://www.my-mock.com";
        url = new URL(h);
        assertThat("no path result empty string.", url.getPath(), equalTo(""));
        assertThat("no query result null", url.getQuery(), nullValue());

    }
    
    @Test
    public void extMatch() throws MalformedURLException {
        String h = "http://www.123.cc";
        
        assertTrue(MyUtil.isFileLike(new URL(h + "/a/bb.cc")));
        assertFalse(MyUtil.isFileLike(new URL(h + "/a/bb.cccc")));
        assertFalse(MyUtil.isFileLike(new URL(h + "/a/bb")));
        assertFalse(MyUtil.isFileLike(new URL(h + "/")));
    }

    @Test
    public void aurl() throws Exception {
        //@formatter:off
        mvc.perform(get("/hello"))
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
