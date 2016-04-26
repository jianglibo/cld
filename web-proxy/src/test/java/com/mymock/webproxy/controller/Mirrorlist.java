/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
@Controller
public class Mirrorlist {
    
    @RequestMapping(path = "/rd", method = RequestMethod.GET)
    public void rd(HttpServletResponse response) throws IOException {
        response.sendRedirect("/afterrd");
    }
    
    @RequestMapping(path = "/afterrd")
    @ResponseBody
    public String afterrd() {
        return "redirect";
    }
}
