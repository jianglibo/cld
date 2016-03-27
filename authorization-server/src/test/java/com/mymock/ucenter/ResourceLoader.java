package com.mymock.ucenter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.common.io.Resources;

/**
 * @author jianglibo@gmail.com
 *         2015年10月8日
 *
 */
public class ResourceLoader {

    public static String load(String name) {
        String localName = name;
        try {
            return Resources.asCharSource(Resources.getResource(localName), StandardCharsets.UTF_8).read();
        } catch (IOException e) {
        }
        return null;
    }
}
