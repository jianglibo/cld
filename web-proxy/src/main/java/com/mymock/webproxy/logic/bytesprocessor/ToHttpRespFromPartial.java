package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.Header;
import org.apache.http.HttpStatus;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.util.CompositeEnv;

public class ToHttpRespFromPartial extends BytesProcessor {
    
    private HttpServletResponse resp;
    
    private OutputStream os;
    
    private Path changingSrcFile;
    
    private InputStream is;
    
    private long receivedCount = 0;
    
    private ResourceLocation rl;

    public ToHttpRespFromPartial(ResourceLocation rl, HttpServletResponse resp, CompositeEnv env) throws BytesProcessorException, IOException {
        super(env);
        this.resp = resp;
        this.rl = rl;
        this.os = resp.getOutputStream();
    }
    
    @Override
    public void start() {
    }
    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#start1()
     */
    @Override
    public void start1() throws IOException {
        changingSrcFile = rl.getDiskPath(getEnv().getAppConfig().getParitalPath());
        resp.setStatus(HttpStatus.SC_OK);
        for(Header hd : getHeaders()) {
            resp.setHeader(hd.getName(), hd.getValue());            
        }
    }

    @Override
    public void consume(byte[] bytes, int num, long numSofar) throws WebProxyExpection, IOException {
        if (is == null) {
            is = Files.newInputStream(changingSrcFile);
        }
        int readed = 0;
        byte[] buf = new byte[bytes.length];
        
        if (receivedCount < numSofar) {
            readed = is.read(buf);
            if (readed != -1) {
                os.write(buf, 0, readed);
                receivedCount += readed;
            }
        }
    }

    @Override
    public void done() throws IOException {
    }

    @Override
    public void done1() throws IOException {
        int readed = 0;
        byte[] buf = new byte[1024];
        while((readed = is.read(buf)) != -1) {
            os.write(buf, 0, readed);
        }
        is.close();
        if (os != null) {
            try {
                os.flush();
                os.close();
            } catch (IOException e) {

            }
        }
    }

    @Override
    public void handleNot200(int statusCode) {
        resp.setStatus(statusCode);
        for(Header hd : getHeaders()) {
            resp.setHeader(hd.getName(), hd.getValue());            
        }
    }

    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#done2()
     */
    @Override
    public void done2() throws IOException {
    }
}
