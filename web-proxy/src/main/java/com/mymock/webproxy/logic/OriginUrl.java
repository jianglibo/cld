/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import com.mymock.webproxy.util.MyUtil;

/**
 * 本应用的端口必须和被代理端口保持一致。
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
public class OriginUrl {
    
    private URL url;
    
    public OriginUrl(URL url) {
        this.url = url;
    }
    
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
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OriginUrl)) {
            return false;
        }
        OriginUrl other = (OriginUrl)obj;
        return this.getUrl().equals(other.getUrl());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
    
    public Path getDiskPath(Path base) {
        return MyUtil.getDiskPath(base, url);
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

    public URL getUrl() {
        return url;
    }
}
