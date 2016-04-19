/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author jianglibo@gmail.com
 *         2016年4月19日
 *
 */

@Controller
@EnableAutoConfiguration
public class WebProxyApp{

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebProxyApp.class, args);
    }
}