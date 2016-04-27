/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import org.springframework.stereotype.Component;

/**
 * @author jianglibo@gmail.com
 *         2016年4月27日
 *
 */
@Component
@JooqRepository(collectionResourceRel="aab", path="aab")    
public class MySvImpl1 implements Mysv {

    /* (non-Javadoc)
     * @see com.mymock.webproxy.aop.Mysv#doSomeThing(java.lang.String)
     */
    @Override
    public String doSomeThing(String commaPair) {
        return null;
    }

}
