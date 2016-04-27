/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
@Configuration
public class DemoConfig {
    
    @Bean
    @Qualifier("firstInstance")
    public Mysv mysv1() {
        return new MySvImpl();
    }
    
    @Bean
    @Qualifier("secondInstance")
    public Mysv mysv2() {
        return new MySvImpl1();
    }
}
