package com.mymock.webproxy.util;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.config.AppConfig;

@Component
public class CompositeEnv {
    
    @Autowired
    private DSLContext create;
    
    @Autowired
    private AppConfig appConfig;

    public DSLContext getCreate() {
        return create;
    }

    public void setCreate(DSLContext create) {
        this.create = create;
    }

    public AppConfig getAppConfig() {
        return appConfig;
    }

    public void setAppConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }
    
    
}
