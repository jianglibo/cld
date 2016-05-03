/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic.resourcegetter;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mymock.webproxy.exception.ResourceGetterException;
import com.mymock.webproxy.logic.HitStatus;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.logic.bytesprocessor.BytesProcessor;
import com.mymock.webproxy.util.MyHttpClient;

/**
 * give a url, I will get the resource, and give it to StreamHolder.
 * 
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */

public class ApacheHcGetter extends ResourceGetter {
    
    private static final Logger logger = LoggerFactory.getLogger(ApacheHcGetter.class);

    private static final Executor executor = Executor.newInstance(new MyHttpClient().getHttpClient());

    public ApacheHcGetter(ResourceLocation rl, HitStatus hitStatus, BytesProcessor... consumers) {
        super(rl, hitStatus, consumers);
    }

    public String play() throws ResourceGetterException {
        try {
            getHitStatus().getHttpClientReqCount().incrementAndGet();
            return executor.execute(Request.Get(getRl().getUrlString())).handleResponse(new DownloadHandler());
        } catch (IOException e) {
            e.printStackTrace();
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
            if (statusLine.getStatusCode() != 200) {
                logger.info("got status {}, Location: {}, origin url: {} ", statusLine.getStatusCode(), aresp.getAllHeaders(), getRl().getUrlString());
                for (BytesProcessor sp : getConsumers()) {
                    sp.setHeaders(getHeaders());
                    sp.handleNot200(statusLine.getStatusCode());
                }
                return RG_NOT_OK;
            }

            HttpEntity entity = aresp.getEntity();
            InputStream is = entity.getContent();

            return distributeStream(is);
        }
    }
}
