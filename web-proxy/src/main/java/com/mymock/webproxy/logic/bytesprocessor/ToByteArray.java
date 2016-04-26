package com.mymock.webproxy.logic.bytesprocessor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.util.CompositeEnv;

public class ToByteArray extends BytesProcessor {
    
    private OutputStream os;
    
    public ToByteArray(ResourceLocation rl, CompositeEnv env) throws IOException {
        super(env);
        this.os = new ByteArrayOutputStream();
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

    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#done2()
     */
    @Override
    public void done2() throws IOException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#start1()
     */
    @Override
    public void start1() throws IOException {
        // TODO Auto-generated method stub
        
    }
}