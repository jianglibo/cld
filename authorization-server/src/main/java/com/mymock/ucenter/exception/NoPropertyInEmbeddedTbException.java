package com.mymock.ucenter.exception;

public class NoPropertyInEmbeddedTbException extends TbClientException {

    public NoPropertyInEmbeddedTbException(String property) {
        super("_embedded object has no key: " + property, "_embedded object has no key: " + property);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
