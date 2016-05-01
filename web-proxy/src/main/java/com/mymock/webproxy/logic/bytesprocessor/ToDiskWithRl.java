package com.mymock.webproxy.logic.bytesprocessor;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.http.Header;

import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

import com.google.common.collect.Lists;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.domain.Wpheader;
import com.mymock.webproxy.domain.Wpurl;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.ResourceLocation;
import com.mymock.webproxy.util.CompositeEnv;

/**
 * get target path from rl.
 * 
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
            Files.createDirectories(path.getParent());
        }
        
        if (Files.exists(path)) {
            Files.delete(path);
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

    /*
     * (non-Javadoc)
     * 
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#done2()
     */
    @Override
    public void done2() throws IOException {
        //@formatter:off
        Path path = rl.getDiskPath(getEnv().getAppConfig().getCachePath());
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path.getParent());
        }
        
        Path partial = rl.getDiskPath(getEnv().getAppConfig().getParitalPath());
        
        Files.move(partial, path, StandardCopyOption.ATOMIC_MOVE);
        
        Wpurl url = new Wpurl();
        url.setAddress(rl.getUrlString());
        
        final Wpurl savedUrl = getEnv().getUrlRepo().save(url);
        
        List<Wpheader> headers = Stream.of(getHeaders()).map(hd -> {
            Wpheader whr = new Wpheader();
            whr.setUrlId(savedUrl.getId());
            whr.setHeaderName(hd.getName());
            whr.setHeaderValue(hd.getValue());
            return whr;
        }).collect(Collectors.toList()); 
        
        getEnv().getHeaderRepo().save(headers);
        //@formatter:on
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mymock.webproxy.logic.bytesprocessor.BytesProcessor#start1()
     */
    @Override
    public void start1() throws IOException {
    }

}
