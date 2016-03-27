package com.mymock.ucenter.utils;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * [scheme:][//authority][path][?query][#fragment] 
 * @author jianglibo@gmail.com
 *
 */
public class UrlTransformer {
    
    private boolean error;
    
    private String scheme;
    
    private String host;
    
    private int port;
    
    private String path;
    
    private String query;
    
    private String fullUrl;
    
    private String fragment;
    
    public UrlTransformer(String fullUrl) {
        URI uri;
        try {
            uri = new URI(fullUrl);
            this.scheme = uri.getScheme();
            this.host = uri.getHost();
            this.port = uri.getPort();
            this.path = uri.getPath();
            this.query = uri.getQuery();
            this.fragment = uri.getFragment();
        } catch (URISyntaxException e) {
            this.error = true;
        }

    }
    
    /**
     * baseUrl is http://localhost
     * @param baseUrl
     * @return
     */
    public UrlTransformer changeBaseUrl(String baseUrl) {
        String[] ss = baseUrl.split("://", 2);
        this.scheme = ss[0];
        this.host = ss[1];
        return this;
    }
    
    public UrlTransformer changeScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    
    public UrlTransformer changeHost(String host) {
        this.host = host;
        return this;
    }
    
    public UrlTransformer changePath(String path) {
        this.path = path;
        return this;
    }
    
    public UrlTransformer changePort(int port) {
        this.port = port;
        return this;
    }
    
    public UrlTransformer changeFragment(String fragment) {
        this.fragment = fragment;
        return this;
    }
    
    public UrlTransformer changeQuery(String query) {
        this.query = query;
        return this;
    }

    
    
    public String lastUrl() {
        if (error) {
            return null;
        }
        try {
            return new URI(scheme,null,host, port,path,query,fragment).toString();
        } catch (URISyntaxException e) {
            return null;
        }
    }
    
    public String originUrl() {
        return fullUrl;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }
}
