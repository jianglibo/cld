package com.mymock.webproxy.logic;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component
public class HitStatus {
    
    private AtomicInteger httpClientReqCount = new AtomicInteger(0);
    
    private AtomicInteger mirrorListDbHit = new AtomicInteger(0);

    public AtomicInteger getHttpClientReqCount() {
        return httpClientReqCount;
    }

    public void setHttpClientReqCount(AtomicInteger httpClientReqCount) {
        this.httpClientReqCount = httpClientReqCount;
    }

    public AtomicInteger getStartCalled() {
        return mirrorListDbHit;
    }

    public void setStartCalled(AtomicInteger mirrorListDbHit) {
        this.mirrorListDbHit = mirrorListDbHit;
    }
    
}
