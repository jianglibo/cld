/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import com.google.common.base.Strings;
import com.mymock.webproxy.util.MyUtil;

/**
 * 本应用的端口必须和被代理端口保持一致。
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
public class OriginUrl {
    
    private URL url;
    
    public OriginUrl(HttpServletRequest req) throws MalformedURLException {
        this.initMe(req);
    }

    /**
     * @param req
     * @throws MalformedURLException 
     */
    private void initMe(HttpServletRequest req) throws MalformedURLException {
       StringBuffer sb = req.getRequestURL();
       String qs = req.getQueryString();
       if (qs != null) {
           sb.append("?").append(qs);
       }
       url = new URL(sb.toString());
    }
    
    public boolean isFileLike() {
        return MyUtil.isFileLike(url);  
    }
    
    public String getUrlString() {
        return url.toString();
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
