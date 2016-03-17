/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.eurekaserver;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

/**
 * @author jianglibo@gmail.com
 *         2016年3月17日
 *
 */
public class PathTest {

    @Test
    public void t() {
        Path p = Paths.get("/opt/eureka-server");
        String fn = p.getFileName().toString();
        assertThat("eureka-server", equalTo(fn));
        
        assertThat("/opt", equalTo(p.getParent().toString().replaceAll("\\\\", "/")));
    }
}
