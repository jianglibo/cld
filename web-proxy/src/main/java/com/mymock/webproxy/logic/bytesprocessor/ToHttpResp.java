package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.Header;
import org.apache.http.HttpStatus;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.util.CompositeEnv;

public class ToHttpResp extends BytesProcessor {
    
    private HttpServletResponse resp;
    
    private OutputStream os;
    

    public ToHttpResp(HttpServletResponse resp, CompositeEnv env) throws BytesProcessorException, IOException {
        super(env);
        this.resp = resp;
    }


    @Override
    public void consume(byte[] bytes, int num, long numSofar) throws WebProxyExpection {
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
    public void done1() {
    }


    @Override
    public void handleNot200(int statusCode) {
        resp.setStatus(statusCode);
        for(Header hd : getHeaders()) {
            resp.addHeader(hd.getName(), hd.getValue());            
        }
    }


    @Override
    public void start() throws IOException {
        this.os = resp.getOutputStream();
        resp.setStatus(HttpStatus.SC_OK);
        for(Header hd : getHeaders()) {
            resp.addHeader(hd.getName(), hd.getValue());            
        }
    }


    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#done2()
     */
    @Override
    public void done2() throws IOException {
    }


    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#start1()
     */
    @Override
    public void start1() throws IOException {
    }

}
