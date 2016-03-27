package com.mymock.ucenter.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author jianglibo@gmail.com
 *         2015年8月27日
 *
 */
public class ThrowableUtil {
    public static String printToString(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}
