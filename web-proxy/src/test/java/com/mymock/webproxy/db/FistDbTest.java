/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.db;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record2;
import org.jooq.Result;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;
import static org.jooq.impl.DSL.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static com.mymock.webproxy.db.public_.tables.Url.URL;
import static com.mymock.webproxy.db.public_.tables.Header.HEADER;

import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.db.public_.Keys;
import com.mymock.webproxy.db.public_.tables.pojos.Url;
import com.mymock.webproxy.db.public_.tables.records.HeaderRecord;
import com.mymock.webproxy.db.public_.tables.records.UrlRecord;

/**
 * @author jianglibo@gmail.com
 *         2016年4月22日
 *
 */
public class FistDbTest extends BaseForTt {

    @Autowired
    private DSLContext create;
    
    @Before
    public void bf() {
        create.delete(URL).execute();
    }

    @Test
    public void createSQL() {
        //@formatter:off
        String sql = create.select(field("URL.ID"), field("URL.ADDRESS"))
                .from(table("URL"))
                .join(table("HEADER"))
                .on(field("URL.ID").equal(field("HEADER.URL_ID")))
                .where(field("URL.ADDRESS").equal("http://www.xx.cc/?u=vvk"))
                .getSQL();
        //@formatter:on
        printme(sql);
        assertTrue(true);
    }

    @Test
    public void createCb() {
        //@formatter:off
        String sql = create.select(URL.ID, URL.ADDRESS)
                .from(URL)
                .join(HEADER)
                .on(URL.ID.equal(HEADER.URL_ID))
                .where(URL.ID.equal(1948))
                .getSQL();
        //@formatter:on
        printme(sql);
        assertTrue(true);
    }

    @Test
    public void fetchRecord() {
        //@formatter:off
        Result<Record2<Integer, String>> result =
            create.select(URL.ID, URL.ADDRESS)
            .from(URL)
            .join(HEADER)
            .on(URL.ID.equal(HEADER.URL_ID))
            .orderBy(URL.TS.asc())
            .fetch();
        //@formatter:on
        assertThat(result.size(), equalTo(0));
    }

    @Test
    public void fetchTypedRecords() {
        create.fetch(URL).stream().forEach(r -> {
            r.fetchChildren(Keys.FK_HEADER_URL).stream().forEach(cr -> {
                printme(cr.toString());
            });
        });
    }
    
    private void insertOne(String url) {
        UrlRecord ur = create.newRecord(URL);
        ur.setAddress(url);
        ur.store();
        assertThat(ur.getId(), greaterThan(0));
        
        ur.into(new Url());
        
        create.insertInto(HEADER, HEADER.URL_ID, HEADER.HEADER_NAME, HEADER.HEADER_VALUE)
            .values(ur.getId(), "n", " a b ")
            .values(ur.getId(), "n1", "hello")
            .execute();
        HeaderRecord hr = create.selectFrom(HEADER).where(HEADER.HEADER_NAME.equalIgnoreCase("n")).fetchOne();
        
        assertThat(hr.getHeaderValue(), equalTo(" a b"));// tail blank are striped.
    }
    
    @Test
    public void cascade() {
        Field<Integer> f = count();
        int urlc = create.select(f).from(URL).fetchOne(f);
        assertThat(urlc, equalTo(0));
        int heac = create.select(f).from(HEADER).fetchOne(f);
        assertThat(heac, equalTo(0));
        
        insertOne("bbq");
        
        urlc = create.select(f).from(URL).fetchOne(f);
        assertThat(urlc, equalTo(1));
        heac = create.select(f).from(HEADER).fetchOne(f);
        assertThat(heac, equalTo(2));
        
        create.delete(URL).execute();

        urlc = create.select(f).from(URL).fetchOne(f);
        assertThat(urlc, equalTo(0));
        heac = create.select(f).from(HEADER).fetchOne(f);
        assertThat(heac, equalTo(0));

    }
    
    
    @Test
    public void stronglyTyped() {
        insertOne("abc");
        UrlRecord ur = create.selectFrom(URL).fetchAny();
        assertThat(ur.getTs(), notNullValue());
        assertThat(ur.getId(), greaterThan(0));
        create.delete(URL).execute();
    }
    
    @Test
    public void customRow() {
        insertOne("xx");
        Result<Record> result = create.select()
                .from(URL)
                .join(HEADER).on(URL.ID.eq(HEADER.URL_ID))
                .fetch();
        result.stream().forEach(r -> {
            UrlRecord ur = r.into(URL);
            HeaderRecord hr = r.into(HEADER);
        });
        create.delete(URL).execute();
    }
    
    @Test
    public void insertReturn() {
      //@formatter:off
        UrlRecord record = create.insertInto(URL, URL.ADDRESS)
                      .values("http://abc.cc/?u=v")
                      .returning(URL.ID, URL.TS)
                      .fetchOne();
        printme("**************************");
        printme(record.getTs());
//        create.insertInto(URL, URL.ADDRESS)
//                .values("http://abc.cc/?u=v")
//                .onDuplicateKeyIgnore()
//                .execute();
        
//        create.delete(URL)
//            .where(URL.ID.equal(record.getId()))
//            .execute();
      //@formatter:on
    }
}
