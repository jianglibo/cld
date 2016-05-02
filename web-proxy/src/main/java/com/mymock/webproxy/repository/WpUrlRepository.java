/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.repository;

import static com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER;
import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

import java.util.List;
import java.util.stream.Collectors;

import org.jooq.Result;
import org.jooq.TableField;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mymock.webproxy.aop.JooqRepository;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.domain.Wpheader;
import com.mymock.webproxy.domain.Wpurl;;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
@JooqRepository
public class WpUrlRepository extends WpRepoBase<Wpurl, WpurlRecord, TableField<WpurlRecord,Integer>, com.mymock.webproxy.db.public_.tables.Wpurl> implements PagingAndSortingRepository<Wpurl, Integer>{

    public WpUrlRepository() {
        super(com.mymock.webproxy.db.public_.tables.Wpurl.WPURL, com.mymock.webproxy.db.public_.tables.Wpurl.WPURL.ID, Wpurl.class);
    }
    
    public Wpurl findByAddress(String address) {
        WpurlRecord wr = create.selectFrom(WPURL).where(WPURL.ADDRESS.eq(address)).fetchOne();
        if (wr == null) {
            return null;
        }
        Wpurl url = wr.into(Wpurl.class);
        Result<WpheaderRecord> whrs = create.selectFrom(WPHEADER).where(WPHEADER.URL_ID.eq(url.getId())).fetch();
        List<Wpheader> whList = whrs.stream().map(whr -> {
            return whr.into(Wpheader.class);
        }).collect(Collectors.toList());
        url.setHeaders(whList);
        return url;
    }
}
