package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import com.mymock.webproxy.exception.WebProxyExpection;

/**
 * get target path from rl.
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public class ToDiskFromPartial extends BytesProcessor {

    private OutputStream os;
    
    private Path dstPath;
    
    private Path changingSrcFile;
    
    private InputStream is;
    
    private long receivedCount = 0;

    public ToDiskFromPartial(Path dstPath, Path changingSrcFile) throws IOException {
        super(null);
        this.dstPath = dstPath;
        this.changingSrcFile = changingSrcFile;
    }
    
    @Override
    public void start() throws IOException {
    }
    
    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#start1()
     */
    @Override
    public void start1() throws IOException {
        this.os = Files.newOutputStream(dstPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
        this.is = Files.newInputStream(changingSrcFile);
    }

    @Override
    public void consume(byte[] bytes, int num, long numSofar) throws WebProxyExpection, IOException {
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
    }

    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#done2()
     */
    @Override
    public void done2() throws IOException {
        // TODO Auto-generated method stub
        
    }



}
