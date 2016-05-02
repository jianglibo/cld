package com.mymock.webproxy.repository;


import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;

import com.google.common.collect.Maps;
import com.mymock.webproxy.aop.JooqRepository;

@Component
public class JooqRepositories extends ApplicationObjectSupport {
    
    @SuppressWarnings("rawtypes")
    private Map<String, WpRepoBase> repos = Maps.newHashMap();
    
    @Override
    @SuppressWarnings("rawtypes")
    protected void initApplicationContext(ApplicationContext context) throws BeansException {
        String[] names = context.getBeanNamesForAnnotation(JooqRepository.class);
        
        for (String n :names) {
            Object b = context.getBean(n);
            if (b instanceof WpRepoBase) {
                repos.put(n, (WpRepoBase) b);
            }
        }
    }

    @SuppressWarnings("rawtypes")
    public Map<String, WpRepoBase> getRepos() {
        return repos;
    }

    @SuppressWarnings("rawtypes")
    public void setRepos(Map<String, WpRepoBase> repos) {
        this.repos = repos;
    }
    
}
