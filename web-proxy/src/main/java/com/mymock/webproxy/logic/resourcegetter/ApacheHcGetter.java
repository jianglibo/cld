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

import com.mymock.webproxy.exception.ResourceGetterException;
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

    private static final Executor executor = Executor.newInstance(new MyHttpClient().getHttpClient());

    public ApacheHcGetter(ResourceLocation ou, BytesProcessor... consumers) {
        super(ou, consumers);
    }

    public String play() throws ResourceGetterException {
        try {
            return executor.execute(Request.Get(getRl().getUrlString())).handleResponse(new DownloadHandler());
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
            if (statusLine.getStatusCode() != 200) {
                for (BytesProcessor sp : getConsumers()) {
                    sp.handleNot200(statusLine.getStatusCode());
                }
                return RG_NOT_OK;
            }
            setHeaders(aresp.getAllHeaders());

            HttpEntity entity = aresp.getEntity();
            InputStream is = entity.getContent();
            
            return distributeStream(is);
        }
    }
}
