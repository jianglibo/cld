package com.mymock.ucenter.exception;

public class NoEmbeddedTbException extends TbClientException {

    public NoEmbeddedTbException() {
        super("no _embedded key in response.", "no _embedded key in response.");
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
