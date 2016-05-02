/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Repository
public @interface JooqRepository {
    
    String path() default "";

    String collectionResourceRel() default "";
}
