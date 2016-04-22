/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
public class MyUtil {
    
    private static final Pattern extPtn = Pattern.compile(".*\\..{1,3}$");
    
    public static boolean isFileLike(URL url) {
        String path = url.getPath();
        if (path.isEmpty() || "/".equals(path)) {
            return false;
        }
        String[] segs = path.split("/");
        return segs.length > 0 && extPtn.matcher(segs[segs.length - 1]).matches();
    }
    
    public static URL changeURLHost(URL url, String host) throws MalformedURLException {
        StringBuffer sb = new StringBuffer(url.getPath());
        if (url.getQuery() != null) {
            sb.append("?").append(url.getQuery());
        }
        return new URL(url.getProtocol(), host , url.getPort(), sb.toString());
    }
}
