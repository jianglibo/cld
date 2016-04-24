package com.mymock.webproxy.exception;

public class ResourceGetterException extends WebProxyExpection {

    /**
     * 
     */
    private static final long serialVersionUID = -2443723852181189599L;
    
    public ResourceGetterException(int errorCode, String msg) {
        super(errorCode, msg);
    }
}
