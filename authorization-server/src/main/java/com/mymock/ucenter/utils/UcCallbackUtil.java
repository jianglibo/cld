package com.mymock.ucenter.utils;

import com.google.common.base.Strings;
import com.mymock.ucenter.exception.OauthStateNotMatchException;


public class UcCallbackUtil {
    
    public static String extractUrlFromCallback(String savedState, String callbackState) throws OauthStateNotMatchException {
        
        if (Strings.isNullOrEmpty(savedState) || Strings.isNullOrEmpty(callbackState)) {
            throw new OauthStateNotMatchException("state not match.");
        }
        
        
        int dash = callbackState.lastIndexOf('-');
        String stateAfterDash = callbackState.substring(dash);
        
        String url = Strings.nullToEmpty(callbackState.substring(0, dash));
        
        if (url.isEmpty()) {
            url = "/";
        }
        
        int savedDash = savedState.lastIndexOf('-');
        
        String savedStateAfterDash = savedState.substring(savedDash);
        
        
        if (!stateAfterDash.equals(savedStateAfterDash)) {
            throw new OauthStateNotMatchException("state not match.");
        }

        return null;
    }

}
