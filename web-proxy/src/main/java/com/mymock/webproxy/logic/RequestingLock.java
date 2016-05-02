package com.mymock.webproxy.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.stereotype.Component;

import com.mymock.webproxy.logic.resourcegetter.ResourceGetter;

@Component
public class RequestingLock {

    private Map<ResourceLocation, ResourceGetter> processingUrls = new HashMap<>();

    private Map<ResourceLocation, ReentrantLock> lockPerRls = new HashMap<>();

    public synchronized ReentrantLock getRlLockOrSet(ResourceLocation rl) {
        if (lockPerRls.containsKey(rl)) {
            return lockPerRls.get(rl);
        } else {
            ReentrantLock lock = new ReentrantLock();
            lockPerRls.put(rl, lock);
            return lock;
        }
    }

    public ResourceGetter getRg(ResourceLocation rl) {
        return processingUrls.get(rl);
    }

    public void rmRg(ResourceLocation rl) {
        processingUrls.remove(rl);
    }

    public void addRg(ResourceGetter rg, ResourceLocation rl) {
        processingUrls.put(rl, rg);
   }

}
