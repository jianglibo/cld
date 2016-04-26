/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.repository;

import org.jooq.Field;
import org.jooq.TableField;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.domain.Wpurl;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
@Repository
public class WpUrlRepository extends WpRepoBase<Wpurl, WpurlRecord, TableField<WpurlRecord,Integer>, com.mymock.webproxy.db.public_.tables.Wpurl> {

    public WpUrlRepository() {
        super(com.mymock.webproxy.db.public_.tables.Wpurl.WPURL, com.mymock.webproxy.db.public_.tables.Wpurl.WPURL.ID, Wpurl.class);
    }
    
}
