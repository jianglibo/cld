package com.mymock.webproxy.exception;

public class CacheItemRemovedException extends WebProxyExpection {

    /**
     * 
     */
    private static final long serialVersionUID = -2443723852181189599L;
    
    public CacheItemRemovedException(int errorCode, String msg) {
        super(errorCode, msg);
    }
}
