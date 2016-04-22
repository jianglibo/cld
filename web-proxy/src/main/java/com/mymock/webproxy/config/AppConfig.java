/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.config;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.annotation.Priority;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */
@Component
@ConfigurationProperties(prefix = "myapp")
@Priority(1)
public class AppConfig implements InitializingBean {

    private static Logger logger = LoggerFactory.getLogger(AppConfig.class);
    
    private String cacheFolder;
    
    private Path cachePath;
    
    private Path paritalPath;

    @Override
    public void afterPropertiesSet() throws Exception {
        File cf = new File(getCacheFolder());
        if (!cf.exists()) {
            cf.mkdirs();
        }
        setCachePath(Paths.get(cf.getPath()));
        
        File pf = new File(cf, "partial");
        if (!pf.exists()) {
            cf.mkdir();
        }
    }

    public String getCacheFolder() {
        return cacheFolder;
    }

    public void setCacheFolder(String cacheFolder) {
        this.cacheFolder = cacheFolder;
    }

    public Path getCachePath() {
        return cachePath;
    }

    public void setCachePath(Path cachePath) {
        this.cachePath = cachePath;
    }

    public Path getParitalPath() {
        return paritalPath;
    }

    public void setParitalPath(Path paritalPath) {
        this.paritalPath = paritalPath;
    }

}
