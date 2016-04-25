package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;

import org.apache.http.Header;

import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.util.CompositeEnv;

public abstract class BytesProcessor {
    
    private Header[] headers;
    
    private CompositeEnv env;
    
    
    public BytesProcessor(CompositeEnv env) {
        this.setEnv(env);
    }
    
    public abstract void consume(byte[] bytes, int num, long numSofar) throws WebProxyExpection, IOException;
    
    public abstract void done() throws IOException;
    
    public abstract void done1() throws IOException;
    
    public abstract void done2() throws IOException;
    
    public abstract void start() throws IOException;
    
    public abstract void start1() throws IOException;
    
    public abstract void handleNot200(int statusCode);
    
    public Header[] getHeaders() {
        return headers;
    }

    public void setHeaders(Header[] headers) {
        this.headers = headers;
    }

    public CompositeEnv getEnv() {
        return env;
    }

    public void setEnv(CompositeEnv env) {
        this.env = env;
    }
}
