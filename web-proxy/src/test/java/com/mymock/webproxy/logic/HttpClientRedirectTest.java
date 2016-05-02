package com.mymock.webproxy.logic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import com.google.common.io.ByteStreams;
import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.util.MyHttpClient;

public class HttpClientRedirectTest extends BaseForTt {
    
    @Value("${server.port}")
    private String port;

    @Test
    public void defaultAutoFollowRedirect() throws ClientProtocolException, IOException {
        Executor exec = Executor.newInstance(new MyHttpClient().getHttpClient());
        exec.execute(Request.Get("http://localhost:" + port + "/rd" )).handleResponse(new ResponseHandler<String>() {
            @Override
            public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
                StatusLine sl = response.getStatusLine();
                printme(sl.getStatusCode());
                printme(sl.getReasonPhrase());
                InputStream is =  response.getEntity().getContent();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ByteStreams.copy(is, baos);
                printme(new String(baos.toByteArray()));
                return "";
            }
        });
    }
}
