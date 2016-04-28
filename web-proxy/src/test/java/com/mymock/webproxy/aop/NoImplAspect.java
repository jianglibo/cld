/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
@Aspect
@Component
public class NoImplAspect {

//    execution(* *(..)), with any return type,any method name, any parameter.
    
//    call(* set(..)), with any return type, any method start with "set", any return type, 
//    execution(int *()), with return type int, no parameter.
//    call(*.new(int, int)), any class construct with two int parameters.
//    target(Point) && call(int *()), any instance of Point,
    
    
    @Autowired
    private DSLContext create;
    
//    @Around("execution(* com.mymock.webproxy.aop.Mysv(..))")
//    @Around("execution(* com.mymock.webproxy.aop.Mysv.*(..)) && args(param)")
    @Around("target(com.mymock.webproxy.aop.NoImpl) && execution(* *(..))")
//    private void inTrading(ProceedingJoinPoint pjp, Object[] param) {
    private String inTrading(ProceedingJoinPoint pjp) {
        try {
            System.out.println(create.toString());
            Object o = pjp.proceed(pjp.getArgs());
            if (o == null) {
                return "o is null";
            } else {
                return "o is not null";
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return "demo-aspect.";
    }
}
