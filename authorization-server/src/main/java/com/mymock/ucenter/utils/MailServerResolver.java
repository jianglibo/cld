package com.mymock.ucenter.utils;

public class MailServerResolver {
    
    public static String resolve(String email) {
        if (email == null || email.trim().isEmpty()) {
            return "";
        }
        if (email.endsWith("@qq.com")) {
            return "https://mail.qq.com";
        }
        return "http://www." + email.split("@")[1]; 
    }

}
