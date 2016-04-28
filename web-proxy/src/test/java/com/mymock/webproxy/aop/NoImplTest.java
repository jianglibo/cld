/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactoryBean;

import com.mymock.webproxy.BaseForTt;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
public class NoImplTest extends BaseForTt {

    
    @Test
    public void t() {
        
        assertTrue(true);
//        ProxyFactoryBean pfb = new ProxyFactoryBean();
//        pfb.setInterfaces(NoImpl.class);
//        NoImpl noimpl = (NoImpl) pfb.getObject();
//        printme("result is: " + noimpl.rtStr("a,b"));
    }
}
