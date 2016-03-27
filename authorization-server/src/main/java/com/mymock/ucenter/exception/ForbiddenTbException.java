package com.mymock.ucenter.exception;

public class ForbiddenTbException extends TbClientException {

    public ForbiddenTbException (String error, String message) {
        super(error, message);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
}

