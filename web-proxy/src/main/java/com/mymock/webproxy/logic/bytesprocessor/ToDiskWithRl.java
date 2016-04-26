package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

import org.apache.http.Header;

import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

import com.google.common.collect.Lists;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.util.CompositeEnv;

/**
 * get target path from rl.
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public class ToDiskWithRl extends BytesProcessor {

    private OutputStream os;
    
    private ResourceLocation rl;

    public ToDiskWithRl(ResourceLocation rl, CompositeEnv env) throws IOException {
        super(env);
        this.rl = rl;
    }
    
    @Override
    public void start() throws IOException {
        Path path = rl.getDiskPath(getEnv().getAppConfig().getParitalPath());
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path);
        }
        this.os = Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
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
        //@formatter:off
        Path path = rl.getDiskPath(getEnv().getAppConfig().getCachePath());
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path);
        }
        
        Path partial = rl.getDiskPath(getEnv().getAppConfig().getParitalPath());
        
        Files.move(partial, path, StandardCopyOption.ATOMIC_MOVE);
        
        List<WpheaderRecord> whrs = Lists.newArrayList();
        
        WpurlRecord wr = getEnv().getCreate().insertInto(WPURL, WPURL.ADDRESS)
                .values(rl.getUrlString())
                .returning()
                .fetchOne();
        
        for(Header hd: getHeaders()) {
            WpheaderRecord whr = new WpheaderRecord();
            whr.setUrlId(wr.getId());
            whr.setHeaderName(hd.getName());
            whr.setHeaderValue(hd.getValue());
            whrs.add(whr);
        }
        
        getEnv().getCreate().batchStore(whrs).execute();
        //@formatter:on
    }

    /* (non-Javadoc)
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#start1()
     */
    @Override
    public void start1() throws IOException {
    }

}