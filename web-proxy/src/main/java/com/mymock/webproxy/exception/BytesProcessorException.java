package com.mymock.webproxy.exception;

public class BytesProcessorException extends WebProxyExpection {

    /**
     * 
     */
    private static final long serialVersionUID = -2443723852181189599L;
    
    public BytesProcessorException(int errorCode, String msg) {
        super(errorCode, msg);
    }
}
