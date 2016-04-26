package com.mymock.webproxy.logic;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class ProxyInterceptTest {
    private Pattern ptn = Pattern.compile("(/api|/api/.*)");
    
    @Test
    public void t() {
        assertTrue(ptn.matcher("/api/wpurls").matches());
    }
}
