/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mymock.webproxy.BaseForTt;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
public class MySvTest extends BaseForTt {
    

    @Test
    public void t() {
        Mysv  mySvImpl = context.getBean(MySvImpl.class);
        mySvImpl.doSomeThing("a,b");
    }
}
