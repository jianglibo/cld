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
public class NoImplTest extends BaseForTt {

    @Autowired
    private NoImpl noImpl;
    
    @Test
    public void t() {
        printme("result is: " + noImpl.rtStr("a,b"));
    }
}
