/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mymock.webproxy.intercept.ProxyIntercept;

/**
 * @author jianglibo@gmail.com
 *         2016年4月19日
 *
 */

@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages="com.mymock")
public class WebProxyApp  extends WebMvcConfigurerAdapter {
    
    @Autowired
    private ProxyIntercept proxyIntercept;

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }
    
    @Bean
    public ProxyIntercept proxyIntercept() {
        return new ProxyIntercept();
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebProxyApp.class, args);
    }
    
    /* (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addArgumentResolvers(java.util.List)
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new ThemeInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
//        registry.addInterceptor(proxyIntercept).addPathPatterns("/**"); //.excludePathPatterns("/api/**", "/api");
    }
}