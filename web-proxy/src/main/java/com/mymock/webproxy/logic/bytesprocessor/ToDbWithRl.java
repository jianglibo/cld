package com.mymock.webproxy.logic.bytesprocessor;

import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.http.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.mymock.webproxy.db.public_.tables.Wpheader;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
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
public class ToDbWithRl extends BytesProcessor {
    
    private static Logger logger = LoggerFactory.getLogger(ToDbWithRl.class);

    private ResourceLocation rl;

    private ByteArrayOutputStream os;

    public ToDbWithRl(ResourceLocation rl, CompositeEnv env) throws IOException {
        super(env);
        this.rl = rl;
    }

    @Override
    public void start() throws IOException {
        os = new ByteArrayOutputStream();
    }

    @Override
    public void consume(byte[] bytes, int num, long numSofar) throws WebProxyExpection {
        os.write(bytes, 0, num);
    }

    @Override
    public void done() throws IOException {
        os.flush();
        os.close();
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
    @Transactional
    public void done2() throws IOException {
        //@formatter:off
        List<WpheaderRecord> whrs = Lists.newArrayList();
        byte[] bytes = os.toByteArray();
        
        logger.info("start to write length of {} bytes to db", bytes.length);
        WpurlRecord wr = getEnv().getCreate().insertInto(WPURL, WPURL.ADDRESS, WPURL.CONTENT)
                .values(rl.getUrlString(), bytes)
                .returning(WPURL.ID)
                .fetchOne();
        
        for(Header hd: getHeaders()) {
            WpheaderRecord whr =  getEnv().getCreate().newRecord(Wpheader.WPHEADER);
            whr.setUrlId(wr.getId());
            whr.setHeaderName(hd.getName());
            whr.setHeaderValue(hd.getValue());
            whrs.add(whr);
        }
        
        getEnv().getCreate().batchStore(whrs).execute();
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
