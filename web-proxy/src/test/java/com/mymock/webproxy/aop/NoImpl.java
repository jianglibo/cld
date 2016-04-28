/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.aop;

import org.springframework.stereotype.Component;

/**
 * @author jianglibo@gmail.com
 *         2016年4月28日
 *
 */
@Component
public interface NoImpl {
    String rtStr(String echo);
}
