/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic.resourcegetter;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.http.Header;

import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.HitStatus;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.bytesprocessor.BytesProcessor;
import com.mymock.webproxy.logic.bytesprocessor.ToHttpRespFromPartial;

/**
 * give a url, I will get the resource, and give it to StreamHolder.
 * 
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */

public abstract class ResourceGetter {

    public static final String RG_OK = "OK";
    public static final String RG_NOT_OK = "NOT_OK";

    private ReentrantLock lock = new ReentrantLock();

    private ResourceLocation rl;

    private BytesProcessor[] consumers;

    private Header[] headers;

    private HitStatus hitStatus;

    public ResourceGetter(ResourceLocation rl, HitStatus hitStatus, BytesProcessor... consumers) {
        this.setRl(rl);
        this.setHitStatus(hitStatus);
        this.consumers = consumers;
    }

    public abstract String play() throws ResourceGetterException, IOException, URISyntaxException;

    protected String distributeStream(InputStream is) throws IOException {
        for (BytesProcessor sp : consumers) {
            sp.setHeaders(getHeaders());
        }

        for (BytesProcessor sp : consumers) {
            sp.start();
        }

        for (BytesProcessor sp : consumers) {
            sp.start1();
        }
        byte[] buf = new byte[1024];
        int num = 0;
        long total = 0;
        try {
            lock.lock();
            try {
                while ((num = is.read(buf)) != -1) {
                    total += num;
                    for (BytesProcessor sp : consumers) {
                        sp.consume(buf, num, total);
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (Exception e) {
            return RG_NOT_OK;
        }

        for (BytesProcessor sp : consumers) {
            sp.done();
        }

        for (BytesProcessor sp : consumers) {
            sp.done1();
        }

        for (BytesProcessor sp : consumers) {
            sp.done2();
        }

        return RG_OK;
    }

    public void addProcessor(ToHttpRespFromPartial bp) {
        lock.lock();
        try {
            int len = this.consumers.length;
            BytesProcessor[] bps = Arrays.copyOf(this.consumers, this.consumers.length + 1);
            bps[len] = bp;
            this.consumers = bps;
        } finally {
            lock.unlock();
        }
    }

    public Header[] getHeaders() {
        return headers;
    }

    public void setHeaders(Header[] headers) {
        this.headers = headers;
    }

    public ResourceLocation getRl() {
        return rl;
    }

    public void setRl(ResourceLocation rl) {
        this.rl = rl;
    }

    public BytesProcessor[] getConsumers() {
        return consumers;
    }

    public void setConsumers(BytesProcessor[] consumers) {
        this.consumers = consumers;
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public HitStatus getHitStatus() {
        return hitStatus;
    }

    public void setHitStatus(HitStatus hitStatus) {
        this.hitStatus = hitStatus;
    }
}
