package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.Header;
import org.apache.http.HttpStatus;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.OriginUrl;
import com.mymock.webproxy.util.CompositeEnv;

public class ToPartialHttpServletResponse extends BytesProcessor {
    
    private HttpServletResponse resp;
    
    private OutputStream os;

    public ToPartialHttpServletResponse(OriginUrl ou, HttpServletResponse resp, CompositeEnv env) throws BytesProcessorException, IOException {
        super(ou, env);
        this.resp = resp;
        this.os = resp.getOutputStream();
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
        resp.setStatus(statusCode);
        for(Header hd : getHeaders()) {
            resp.addHeader(hd.getName(), hd.getValue());            
        }
    }


    @Override
    public void start() {
        resp.setStatus(HttpStatus.SC_OK);
        for(Header hd : getHeaders()) {
            resp.addHeader(hd.getName(), hd.getValue());            
        }
    }

}
