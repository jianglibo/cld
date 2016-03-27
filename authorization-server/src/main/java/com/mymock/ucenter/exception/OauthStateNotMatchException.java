package com.mymock.ucenter.exception;

public class OauthStateNotMatchException extends TbClientException {
    
    public OauthStateNotMatchException(String message) {
        super("stateNotMatch", message);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
