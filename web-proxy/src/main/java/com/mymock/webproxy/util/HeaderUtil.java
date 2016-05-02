package com.mymock.webproxy.util;

import java.util.Set;

import com.google.common.collect.Sets;

public class HeaderUtil {
    
    private static final Set<String> excludeHeaders = Sets.newHashSet("Connection".toUpperCase());
    
    public static boolean skip(String hn) {
        if (excludeHeaders.contains(hn.toUpperCase())) {
            return true;
        }
        return false;
    }
    
    public static boolean isTransferEncoding(String hn) {
        return "Transfer-Encoding".equalsIgnoreCase(hn);
    }

}
