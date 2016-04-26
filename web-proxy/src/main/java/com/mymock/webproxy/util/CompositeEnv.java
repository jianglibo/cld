package com.mymock.webproxy.util;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mymock.webproxy.config.AppConfig;
import com.mymock.webproxy.repository.WpHeaderRepository;
import com.mymock.webproxy.repository.WpUrlRepository;

@Component
public class CompositeEnv {
    
    @Autowired
    private DSLContext create;
    
    @Autowired
    private AppConfig appConfig;
    
    @Autowired
    private WpUrlRepository urlRepo;
    
    @Autowired
    private WpHeaderRepository headerRepo;

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

    public WpUrlRepository getUrlRepo() {
        return urlRepo;
    }

    public void setUrlRepo(WpUrlRepository urlRepo) {
        this.urlRepo = urlRepo;
    }

    public WpHeaderRepository getHeaderRepo() {
        return headerRepo;
    }

    public void setHeaderRepo(WpHeaderRepository headerRepo) {
        this.headerRepo = headerRepo;
    }
}
