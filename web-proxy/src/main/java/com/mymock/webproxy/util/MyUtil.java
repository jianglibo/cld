/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import com.google.common.collect.Lists;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
public class MyUtil {

    private static final Pattern extPtn = Pattern.compile(".*\\..{1,3}$");

    private static final String[] EMPTY_STRINGS = new String[] {};

    public static boolean isFileLike(String url) {
        try {
            return isFileLike(new URL(url));
        } catch (MalformedURLException e) {
            return false;
        }
    }

    public static boolean isFileLike(URL url) {
        return extractRelativePath(url).length != 0;
    }

    public static String[] extractFileName(String url) {
        try {
            return extractRelativePath(new URL(url));
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public static String[] extractRelativePath(URL url) {
        String path = url.getPath();
        if (path.isEmpty() || "/".equals(path)) {
            return EMPTY_STRINGS;
        }
        if (url.getQuery() != null) {
            return EMPTY_STRINGS;
        }
        String[] segs = path.split("/");
        if (segs.length == 0) {
            return null;
        }
        String lastSeg = segs[segs.length - 1];

        if (extPtn.matcher(lastSeg).matches()) {
            String[] ss = new String[segs.length - 1];
            for (int i = ss.length - 1; i > -1; i--) {
                ss[i] = segs[i + 1];
            }
            return ss;
        }
        return EMPTY_STRINGS;
    }

    public static Path getDiskPath(Path base, String url) {
        try {
            return getDiskPath(base, new URL(url));
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public static Path getDiskPath(Path base, URL url) {
        String[] segs = extractRelativePath(url);
        if (segs.length == 0) {
            return null;
        } else {
            return Paths.get(base.toString(), segs);
        }
    }

    public static URL changeURLHost(URL url, String host) throws MalformedURLException {
        StringBuffer sb = new StringBuffer(url.getPath());
        if (url.getQuery() != null) {
            sb.append("?").append(url.getQuery());
        }
        return new URL(url.getProtocol(), host, url.getPort(), sb.toString());
    }

    public static URL fromReq(StringBuffer requestUrl, String qs) throws MalformedURLException {
        if (qs != null) {
            requestUrl.append("?").append(qs);
        }
        return new URL(requestUrl.toString());
    }

    public static String subsParameter(String qs, String... pns) {
        String[] ss = qs.split("&");
        List<String> after = Lists.newArrayList();
        for (String pairStr : ss) {
            String[] pair = pairStr.split("=");
            boolean found = false;
            if (pair.length == 2) {
                for (String pn : pns) {
                    if (pn.equalsIgnoreCase(pair[0])) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                after.add(String.join("=", pair));
            }
        }
        return String.join("&", after);
    }

}
