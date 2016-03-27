package com.mymock.ucenter;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author jianglibo@gmail.com
 *         2015年10月9日
 *
 */
public abstract class NfTsBase {
    
    protected static String EMBEDDED = "_embedded";
    
    public abstract ObjectMapper getObjectMapper();
    
    public abstract String getRestUri(String withoutBase);

    public JsonUtil jsonUtil() {
        return new JsonUtil(getObjectMapper());
    }
    
    public JsonAssertUtil jsonAssertUtil() {
        JsonUtil jsonUtil = new JsonUtil(getObjectMapper());
        return new JsonAssertUtil(getObjectMapper(), jsonUtil);
    }
    
    public void printme(Object o) {
        System.out.println(o);
    }

    public String loadResourceInTbrsPackage(String rn) {
        return ResourceLoader.load("cc/openscanner/tbrs/" + rn);
    }
}
