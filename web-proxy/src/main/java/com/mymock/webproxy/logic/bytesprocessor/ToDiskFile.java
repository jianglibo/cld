package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.apache.http.Header;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.OriginUrl;
import com.mymock.webproxy.util.CompositeEnv;

public class ToDiskFile extends BytesProcessor {
    
    private OutputStream os;
    
    public ToDiskFile(OriginUrl ou, CompositeEnv env) throws IOException {
        super(ou, env);
        this.initMe();
    }
    
    private void initMe() throws IOException {
        Path path = getOu().getDiskPath(getEnv().getAppConfig().getParitalPath());
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path);
        }
        this.os = Files.newOutputStream(path, StandardOpenOption.CREATE);
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
