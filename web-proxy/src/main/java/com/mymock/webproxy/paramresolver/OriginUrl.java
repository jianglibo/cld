/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.paramresolver;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
public class OriginUrl {

    private HttpServletRequest req;
    
    public OriginUrl(HttpServletRequest req) {
        this.req = req;
    }
}
