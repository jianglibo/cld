package com.mymock.ucenter.utils;


public class UriSegmentUtil {
    
    public static String getSegmentFromEnd(String uri, int pos) {
        String[] ss = uri.substring(1).split("/");
        int len = ss.length;
        return ss[len - pos - 1];
    }
    
    
    public static long getLongValueFromEnd(String uri, int pos) {
        return Long.valueOf(getSegmentFromEnd(uri, pos));
    }
}
