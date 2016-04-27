/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
@Aspect
@Component
public class DemoAspect {

//    execution(* *(..)), with any return type,any method name, any parameter.
    
//    call(* set(..)), with any return type, any method start with "set", any return type, 
//    execution(int *()), with return type int, no parameter.
//    call(*.new(int, int)), any class construct with two int parameters.
//    target(Point) && call(int *()), any instance of Point,
    
    
//    @Around("execution(* com.mymock.webproxy.aop.Mysv(..))")
//    @Around("execution(* com.mymock.webproxy.aop.Mysv.*(..)) && args(param)")
    @Around("target(com.mymock.webproxy.aop.Mysv) && execution(* *(..))")
//    private void inTrading(ProceedingJoinPoint pjp, Object[] param) {
    private void inTrading(ProceedingJoinPoint pjp) {
        System.out.println(pjp.getSignature().getName());
        System.out.println("from DemoAspect:" + pjp.getArgs());
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
