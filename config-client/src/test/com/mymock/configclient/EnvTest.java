/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.configclient;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;


/**
 * @author jianglibo@gmail.com
 *         2016年3月15日
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
public class EnvTest {

    @Value("${local.server.port}")
    private int port = 0;
    
    @Autowired
    private Environment env;

    /**
     * should got foo value.
     */
    @Test
    public void fooAvailable() {
        assertThat(env.getProperty("foo"), is("bar"));
    }
    
    @Test
    public void infoFromRemote() {
        assertThat(env.getProperty("info.description"), is("Spring Cloud Samples"));
    }
    
    @Test
    public void infoFromLocal() {
        assertThat(env.getProperty("info.description1"), is("local info."));
    }

//    @Test
//    public void envPostAvailable() {
//        MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
//        @SuppressWarnings("rawtypes")
//        ResponseEntity<Map> entity = new TestRestTemplate().postForEntity(
//                "http://localhost:" + port + "/admin/env", form, Map.class);
//        assertEquals(HttpStatus.OK, entity.getStatusCode());
//    }

}