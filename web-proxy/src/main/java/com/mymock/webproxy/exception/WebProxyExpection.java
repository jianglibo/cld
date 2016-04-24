package com.mymock.webproxy.exception;

public class WebProxyExpection extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 2103568573824815504L;
    
    private int errorCode;
    
    public WebProxyExpection(int errorCode, String msg) {
        super(msg);
        this.setErrorCode(errorCode);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

}
