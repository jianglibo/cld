
package com.mymock.ucenter.utils;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jianglibo@gmail.com
 *         2015年8月28日
 *
 */
public class FileNameUtil {

    private static Pattern extPtn = Pattern.compile(".*(\\.\\w{1,6}$)");

    private static Pattern noExtPtn = Pattern.compile("(^.*)\\.\\w{1,6}$");

    public static String getExtWithDot(String urlOrPath) {
        Matcher m = extPtn.matcher(urlOrPath);
        if (m.matches()) {
            return m.group(1);
        }
        return "";
    }
    
    public static boolean hasExt(Path path) {
        return !getExtWithDot(path).isEmpty();
    }

    public static String getExtWithDot(Path path) {
        return getExtWithDot(path.toString());
    }

    public static String deleteExt(String fn) {
        Matcher m = noExtPtn.matcher(fn);
        if (m.matches()) {
            return m.group(1);
        }
        return fn;
    }

    public static <T> String getPackageName(Class<T> c, int shorten) {
        if (shorten < 1)
            shorten = 1;
        String cn = c.getName();
        for (int i = 0; i < shorten; i++) {
            cn = cn.substring(0, cn.lastIndexOf('.'));
        }
        return cn;
    }

    public static <T> String getPackageName(Class<T> c) {
        return getPackageName(c, 1);
    }

}
