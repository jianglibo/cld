/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mymock.webproxy.BaseForTt;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
public class MySvTest2 extends BaseForTt {
    
    @Autowired
    @Qualifier("firstInstance")
    Mysv mysv;
    
    @Autowired
    @Qualifier("secondInstance")
    Mysv mysv1;

    @Test
    public void t() {
        mysv.doSomeThing("a,b");
        mysv1.doSomeThing("a1,b1");
    }
}
