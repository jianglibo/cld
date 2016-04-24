package com.mymock.webproxy.db;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.jooq.DSLContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Lists;
import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.db.public_.tables.Wpheader;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;

import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;
import static com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER;

public class WpurlTest extends BaseForTt {
    
    @Autowired
    private DSLContext create;
    
    @Test
    public void create() {
        //@formatter:off
        create.delete(WPURL).execute();
        WpurlRecord wr = create.insertInto(WPURL, WPURL.ADDRESS)
            .values("http://www.csd.com")
            .returning()
            .fetchOne();
        
        assertThat(wr.getCnt(), equalTo(0));
        assertThat(wr.getContent(), nullValue());
        
        wr = create.selectFrom(WPURL)
            .where(WPURL.ADDRESS.eq("http://www.csd.com"))
            .fetchOne();
        
        assertThat(wr.getCnt(), equalTo(0));
        assertThat(wr.getContent(), nullValue());

        //@formatter:on
    }
    
    @Test
    public void batch() {
        create.delete(Wpheader.WPHEADER).execute();
        List<WpheaderRecord> wrs = Lists.newArrayList();
        WpheaderRecord wr = new WpheaderRecord();
        wr.setHeaderName("a");
        wr.setHeaderValue("1");
        wrs.add(wr);
        
        wr = new WpheaderRecord();
        wr.setHeaderName("a");
        wr.setHeaderValue("1");
        wrs.add(wr);
        
        int[] ints = create.batchStore(wrs).execute();
        
        assertThat(ints.length, equalTo(2));
    }
    
    @Test
    public void increament() {
        create.delete(WPURL).execute();
        
        WpurlRecord wr = create.insertInto(WPURL, WPURL.ADDRESS).values("abc").returning().fetchOne();
        
        assertThat(wr.getCnt(), equalTo(0));
        
        int c = create.update(WPURL).set(WPURL.CNT, WPURL.CNT.add(1)).returning(WPURL.CNT).execute();
        assertThat(c, equalTo(1));
    }

}
