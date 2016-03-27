package com.mymock.ucenter.utils;

import java.util.Base64;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/**
 * @author jianglibo@gmail.com
 *         2015年8月26日
 *
 */
public class BasicAuthenticationHeader {
    
    private String username;
    private String password;
    
    public BasicAuthenticationHeader(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Header asBasicHeader() {
        return new BasicHeader(getHeaderName(), getHeaderValue());
    }
    
    public String getHeaderName() {
        return "Authorization";
    }
    
    public String getHeaderValue() {
        String ba = getUsername() + ":" + getPassword();
        String encoding = Base64.getEncoder().encodeToString(ba.getBytes());
        return "Basic " + encoding;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
