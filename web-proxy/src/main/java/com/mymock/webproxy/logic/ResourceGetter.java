/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;

import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.bytesprocessor.BytesProcessor;
import com.mymock.webproxy.logic.bytesprocessor.ToPartialHttpServletResponse;
import com.mymock.webproxy.util.MyHttpClient;

/**
 * give a url, I will get the resource, and give it to StreamHolder.
 * 
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */

public class ResourceGetter {

    private static final Executor executor = Executor.newInstance(new MyHttpClient().getHttpClient());

    public static final String RG_OK = "OK";
    public static final String RG_NOT_OK = "NOT_OK";

    private ReentrantLock lock = new ReentrantLock();

    private OriginUrl ou;

    private BytesProcessor[] consumers;

    private Header[] headers;

    public ResourceGetter(OriginUrl ou, BytesProcessor... consumers) {
        this.ou = ou;
        this.consumers = consumers;
    }

    public String play() throws ResourceGetterException {
        try {
            return executor.execute(Request.Get(ou.getUrlString())).handleResponse(new DownloadHandler());
        } catch (IOException e) {
            throw new ResourceGetterException(2001, e.getMessage());
        }
    }

    public class DownloadHandler implements ResponseHandler<String> {

        /*
         * (non-Javadoc)
         * 
         * @see org.apache.http.client.ResponseHandler#handleResponse(org.apache.http.HttpResponse)
         */
        @Override
        public String handleResponse(HttpResponse aresp) throws ClientProtocolException, IOException {
            StatusLine statusLine = aresp.getStatusLine();
            setHeaders(aresp.getAllHeaders());

            for (BytesProcessor sp : consumers) {
                sp.setHeaders(getHeaders());
            }
            HttpEntity entity = aresp.getEntity();
            InputStream is = entity.getContent();

            if (statusLine.getStatusCode() != 200) {
                for (BytesProcessor sp : consumers) {
                    sp.handleNot200(statusLine.getStatusCode());
                }
                is.close();
                return RG_NOT_OK;
            }

            for (BytesProcessor sp : consumers) {
                sp.start();
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
                            sp.consume(buf, num, total, getHeaders());
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
                sp.allListenerDone();
            }

            return RG_OK;
        }
    }

    public void addProcessor(ToPartialHttpServletResponse bp) {
        lock.lock();
        try {
            int len = this.consumers.length;
            BytesProcessor[] bps = new BytesProcessor[len + 1];
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
}
