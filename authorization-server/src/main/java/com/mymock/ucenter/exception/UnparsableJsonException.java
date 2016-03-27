package com.mymock.ucenter.exception;

public class UnparsableJsonException extends TbClientException {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public UnparsableJsonException(String error, String message) {
        super(error, message);
    }

}

