/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.logic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.fluent.Request;
import org.springframework.stereotype.Component;

import com.google.common.io.ByteStreams;

/**
 * @author jianglibo@gmail.com
 *         2016年4月21日
 *
 */

@Component
public class FileDownloader {
    
    public void doit(OriginUrl ou, HttpServletResponse resp) throws ClientProtocolException, IOException {
        Request.Get(ou.getUrlString())
        .execute().handleResponse(new DownloadHandler(resp));
    }
    
    public class DownloadHandler implements ResponseHandler<Void> {

        private HttpServletResponse respToClient;

        public DownloadHandler(HttpServletResponse respToClient) {
            this.respToClient = respToClient;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.apache.http.client.ResponseHandler#handleResponse(org.apache.http.HttpResponse)
         */
        @Override
        public Void handleResponse(HttpResponse aresp) throws ClientProtocolException, IOException {
            StatusLine statusLine = aresp.getStatusLine();
            aresp.getAllHeaders();
            for (Header hd : aresp.getAllHeaders()) {
                respToClient.addHeader(hd.getName(), hd.getValue());
            }
            HttpEntity entity = aresp.getEntity();
            InputStream is = entity.getContent();
            OutputStream os = respToClient.getOutputStream();
            ByteStreams.copy(is, os);
            return null;
        }
    }
}
