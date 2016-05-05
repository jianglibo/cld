/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.service;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mymock.webproxy.BaseForTt;

/**
 * @author jianglibo@gmail.com
 *         2016年5月5日
 *
 */
public class HttpsConvertTest extends BaseForTt {
    
    @Autowired
    private HttpsConvertor httpsConvertor;
    
    @Test
    public void t() throws MalformedURLException {
        URL url = new URL("http://www.rabbitmq.com/rabbitmq-signing-key-public.asc");
        
        url = httpsConvertor.convertToHttpsIfNeed(url);
        
        assertThat(url.getProtocol(), equalTo("https"));
    }

}
