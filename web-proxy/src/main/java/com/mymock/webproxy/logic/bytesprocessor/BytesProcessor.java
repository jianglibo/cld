package com.mymock.webproxy.logic.bytesprocessor;

import java.nio.file.Path;

import org.apache.http.Header;

import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.OriginUrl;
import com.mymock.webproxy.util.CompositeEnv;

public abstract class BytesProcessor {
    
    private Header[] headers;
    
    private Path webProxyPath;
    
    private Path partialPath;
    
    private CompositeEnv env;
    
    private OriginUrl ou;
    
    public BytesProcessor(OriginUrl ou, CompositeEnv env) {
        this.setOu(ou);
        this.setEnv(env);
    }
    
    public abstract void consume(byte[] bytes, int num, long numSofar, Header[] allHeaders) throws WebProxyExpection;
    
    public abstract void done();
    
    public abstract void allListenerDone();
    
    public abstract void start();
    
    public abstract void handleNot200(int statusCode);
    
    public Header[] getHeaders() {
        return headers;
    }

    public void setHeaders(Header[] headers) {
        this.headers = headers;
    }

    public Path getWebProxyPath() {
        return webProxyPath;
    }

    public void setWebProxyPath(Path webProxyPath) {
        this.webProxyPath = webProxyPath;
    }

    public Path getPartialPath() {
        return partialPath;
    }

    public void setPartialPath(Path partialPath) {
        this.partialPath = partialPath;
    }

    public CompositeEnv getEnv() {
        return env;
    }

    public void setEnv(CompositeEnv env) {
        this.env = env;
    }

    public OriginUrl getOu() {
        return ou;
    }

    public void setOu(OriginUrl ou) {
        this.ou = ou;
    }

}
