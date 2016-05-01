/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Objects;

import com.mymock.webproxy.util.MyUtil;

/**
 * 本应用的端口必须和被代理端口保持一致。
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
public class ResourceLocation {
    
    private URL url;
    
    public ResourceLocation(Path path) throws MalformedURLException {
        this.url = path.toUri().toURL();
    }
    
    public ResourceLocation(URL url) {
        this.url = url;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ResourceLocation)) {
            return false;
        }
        ResourceLocation other = (ResourceLocation)obj;
        return this.getUrl().equals(other.getUrl());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
    
    public String getHost() {
        return this.getUrl().getHost();
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
