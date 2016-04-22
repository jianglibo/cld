/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;

/**
 * @author jianglibo@gmail.com
 *         2016年4月20日
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebProxyApp.class)
@WebIntegrationTest({ "appmisc.in-testing=true" })
public class BaseForTt {

    protected MockMvc mvc;
    
    @Autowired
    protected WebApplicationContext context;

    @Before
    public void before() {
        mvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();
    }

    @After
    public void defaultAfter() {
        mvc = null;
    }
    
    protected void printme(Object o) {
        System.out.println(o.toString());
    }
    
    protected void printPair(Object o, Object o1) {
        System.out.println(o.toString() + " = " + o1.toString());
    }

}
