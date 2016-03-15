package com.mymock.eurekaclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */

/**
 * @author jianglibo@gmail.com
 *         2016年3月14日
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}