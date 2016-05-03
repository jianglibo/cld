package com.mymock.webproxy.logic;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component
public class HitStatus {
    
    private AtomicInteger httpClientReqCount = new AtomicInteger(0);
    
    private AtomicInteger startCalled = new AtomicInteger(0);
    
    public void reset() {
        httpClientReqCount.set(0);
        startCalled.set(0);
    }

    public AtomicInteger getHttpClientReqCount() {
        return httpClientReqCount;
    }

    public void setHttpClientReqCount(AtomicInteger httpClientReqCount) {
        this.httpClientReqCount = httpClientReqCount;
    }

    public AtomicInteger getStartCalled() {
        return startCalled;
    }

    public void setStartCalled(AtomicInteger mirrorListDbHit) {
        this.startCalled = mirrorListDbHit;
    }
    
}
