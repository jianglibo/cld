/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.service;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.util.MyUtil;

/**
 * @author jianglibo@gmail.com
 *         2016年5月5日
 *
 */
@Component
public class HttpsConvertor {

    @Autowired
    private AppConfig appConfig;
    
    public URL convertToHttpsIfNeed(URL url) throws MalformedURLException {
        if (appConfig.getHttpsUrls().contains(url.getHost() + url.getPath())) {
            return MyUtil.changeProtocol(url, "https");
        } else if (appConfig.getHttpsHosts().contains(url.getHost())) {
            return MyUtil.changeProtocol(url, "https");
        } else {
            return url;
        }
    }
}
