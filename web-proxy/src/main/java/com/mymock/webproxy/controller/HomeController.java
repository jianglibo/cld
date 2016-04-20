/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mymock.webproxy.paramresolver.OriginUrl;

/**
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
@Controller
public class HomeController {

    @RequestMapping("/**")
    @ResponseBody
    String home(HttpServletRequest req) {
        return "Hello World!";
    }
}
