package com.mymock.ucenter.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.google.common.base.CharMatcher;

public class PasswordPolicy {
    
    private static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String numbers = "1234567890";
    private static final String simbols = "`~!@#$%^&*()_+-={}|[]\\:\";'<>?,./";
    private static final int min = 6;
    private static final int max = 32;
    
    private static final String allLetters = letters + numbers + simbols;

    public static PasswordViolationMessage validatePassword(String password) {
        if (password.length() < min) {
           return PasswordViolationMessage.PWD_TOO_SHORT; 
        }
        
        if (password.length() > max) {
            return PasswordViolationMessage.PWD_TOO_LONG;
        }
        
        if (!CharMatcher.anyOf(allLetters).matchesAllOf(password)) {
           return PasswordViolationMessage.PWD_CONTAIN_ILLEGAL_CHAR; 
        }
        
        char[] cs = password.toCharArray();
        
        return PasswordViolationMessage.YES;
    }
    
    
    public static enum PasswordViolationMessage {
        PWD_TOO_SHORT, PWD_TOO_LONG, YES, PWD_CONTAIN_ILLEGAL_CHAR
    }
}
