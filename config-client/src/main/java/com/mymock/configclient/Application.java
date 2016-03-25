package com.mymock.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */

/**
 * @author jianglibo@gmail.com
 *         2016年3月14日
 *
 */
@RestController
@SpringBootApplication
@EnableEurekaClient
public class Application {

    @Value("${foo}")
    String name = "World";
    
    @Value("${info.description}")
    String info = "info";

    @Autowired
    private Environment env;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 从 git的配置中，首先是获取foo.properties,然后是application.yml.
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping("/")
    public String home() throws JsonProcessingException {
        Environment ev = env;
        System.out.println(ev);
        return "hello " + name + " " + info;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}