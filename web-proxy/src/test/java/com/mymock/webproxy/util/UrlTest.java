/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.util;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public class UrlTest {
    
    @Test
    public void q() {
        
    }

    @Test
    public void protocal() throws MalformedURLException {
        URL url = new URL("http://www.cc.com");
        
        assertThat(url.getProtocol(), equalTo("http"));
        url = new URL("https://www.cc.com");
        
        assertThat(url.getProtocol(), equalTo("https"));
        url = new URL("file://c:");
        assertThat(url.getProtocol(), equalTo("file"));
        
        Path path = Paths.get("abc");
        
        url = path.toUri().toURL();
        
        assertThat(url.toString(), endsWith("/abc"));
    }
}
