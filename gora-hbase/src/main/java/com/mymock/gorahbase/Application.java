package com.mymock.gorahbase;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}