/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
@Controller
public class HomeController {

    @RequestMapping(path = "/**", method = RequestMethod.GET)
    void home(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.print("Hello World!");
        out.flush();
        out.close();
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    void hello(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.print("Hello World!");
        out.flush();
        out.close();
    }
    
    @RequestMapping(path = "/headers", method = RequestMethod.GET)
    @ResponseBody
    String headers(HttpServletRequest req) {
        Enumeration<String> hne = req.getHeaderNames();
        StringBuffer sb = new StringBuffer();
        while (hne.hasMoreElements()) {
            String hn = hne.nextElement();
            sb.append(hn).append("=").append(req.getHeader(hn)).append("\n");
        }
        return sb.toString();
    }
}

//><|:&