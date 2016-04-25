package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;

/**
 * get target path from rl.
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public class ToDiskWithPath extends BytesProcessor {

    private OutputStream os;
    
    private Path dstPath;
    

    public ToDiskWithPath(Path dstPath) throws IOException {
        super(null);
        this.dstPath = dstPath;
    }
    
    @Override
    public void start() throws IOException {
        this.os = Files.newOutputStream(dstPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    @Override
    public void consume(byte[] bytes, int num, long numSofar) throws WebProxyExpection {
        System.out.println(num + "," + numSofar);
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
    public void done1() throws IOException {
    }

    @Override
    public void handleNot200(int statusCode) {
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
        // TODO Auto-generated method stub
        
    }

}
