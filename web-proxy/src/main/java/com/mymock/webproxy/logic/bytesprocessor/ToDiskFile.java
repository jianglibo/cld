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
import static com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER;

import com.google.common.collect.Lists;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.domain.Wpheader;
import com.mymock.webproxy.exception.BytesProcessorException;
import com.mymock.webproxy.exception.WebProxyExpection;
import com.mymock.webproxy.logic.OriginUrl;
import com.mymock.webproxy.util.CompositeEnv;

public class ToDiskFile extends BytesProcessor {

    private OutputStream os;

    public ToDiskFile(OriginUrl ou, CompositeEnv env) throws IOException {
        super(ou, env);
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
    public void allListenerDone() throws IOException {
        //@formatter:off
        Path path = getOu().getDiskPath(getEnv().getAppConfig().getCachePath());
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path);
        }
        Path partial = getOu().getDiskPath(getEnv().getAppConfig().getParitalPath());
        Files.move(partial, path, StandardCopyOption.ATOMIC_MOVE);
        
        List<WpheaderRecord> whrs = Lists.newArrayList();
        
        WpurlRecord wr = getEnv().getCreate().insertInto(WPURL, WPURL.ADDRESS)
                .values(getOu().getUrlString())
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

    @Override
    public void handleNot200(int statusCode) {
        // TODO Auto-generated method stub
    }

    @Override
    public void start() throws IOException {
        Path path = getOu().getDiskPath(getEnv().getAppConfig().getParitalPath());
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path);
        }
        this.os = Files.newOutputStream(path, StandardOpenOption.CREATE);
    }
}
