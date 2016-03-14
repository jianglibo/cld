package com.mymock.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer 
public class Application {

//    @Value("${config.name}")
//    String name = "World";
//
//  @RequestMapping("/")
//  public String home() {
//    return "Hello " + name;
//  }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}