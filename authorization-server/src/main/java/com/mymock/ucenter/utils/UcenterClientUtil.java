
package com.mymock.ucenter.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UcenterClientUtil {
    private static final Pattern uuidKeyPtn = Pattern.compile("/\\w{32}\\.[^.]+$");
    
    private static final Pattern idPattern = Pattern.compile(".*?(\\d+).*");
    
    public static boolean isUuidUrlKey(String urlKey) {
        return uuidKeyPtn.matcher(urlKey).matches();
    }
    
    public static long linkToId(String link) {
        String ids = link.substring(link.lastIndexOf("/") + 1);
        Matcher m = idPattern.matcher(ids);
        if (m.matches()) {
            return Long.valueOf(m.group(1));
        }
        return Long.valueOf(ids);
    }
    
//    public static void main(String...args) {
//        System.out.println(linkToId("/api/vi/posts/4455{abc}"));
//        System.out.println(linkToId("/api/vi/posts/4455"));
//        System.out.println(linkToId("/api/vi/posts/4455?{}"));
//    }

}
