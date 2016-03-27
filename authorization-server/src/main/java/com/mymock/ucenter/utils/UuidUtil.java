
package com.mymock.ucenter.utils;

import java.util.UUID;

/**
 * @author jianglibo@gmail.com
 *         2015年8月12日
 *
 */
public class UuidUtil {
    
    public static String uuidNoDash() {
        return UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
    }
    
    public static String uuidNoDashUpcase() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

}
