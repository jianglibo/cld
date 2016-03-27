package com.mymock.ucenter;

/**
 * @author jianglibo@gmail.com
 *         2015年10月10日
 *
 */
public class TeEnvConstant {
    public static final String DATA_BASE_URI = "spring.data.rest.base-uri";
    
    public static final String ENABLE_CTX_CACHE_LOG = "org.springframework.test.context.cache=DEBUG";
    
    public static final String ZERO_SERVER_PORT = "server.port=0";
    
    public final static String MEM_JDBC = "spring.datasource.primary.url=jdbc:h2:mem:test";
}
