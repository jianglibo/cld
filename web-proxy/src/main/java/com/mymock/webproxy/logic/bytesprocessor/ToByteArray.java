package com.mymock.webproxy.logic.bytesprocessor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.http.Header;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.OriginUrl;
import com.mymock.webproxy.util.CompositeEnv;

public class ToByteArray extends BytesProcessor {
    
    private OutputStream os;
    
    public ToByteArray(OriginUrl ou, CompositeEnv env) throws IOException {
        super(ou, env);
        this.os = new ByteArrayOutputStream();
    }

    @Override
    public void consume(byte[] bytes, int num, long numSofar, Header[] allHeaders) throws WebProxyExpection {
        try {
            os.write(bytes, 0, num);
        } catch (IOException e) {
            throw new BytesProcessorException(1001, e.getMessage());
        }
    }

    @Override
    public void done() {
        if (os != null) {
            try {
                os.flush();
                os.close();
            } catch (IOException e) {

            }
        }
    }

    @Override
    public void allListenerDone() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void handleNot200(int statusCode) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }
}
