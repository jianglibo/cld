/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

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
        assertThat("Mysv has 4 beans.", context.getBeanNamesForType(Mysv.class).length, equalTo(4));
        assertThat("Mysv has 4 beans.", context.getBeanNamesForAnnotation(JooqRepository.class).length, equalTo(2));
        printme("result is: " + mysv.doSomeThing("a,b"));
        printme ("result is: " + mysv1.doSomeThing("a1,b1"));
    }
}
