/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.repository;

import org.jooq.TableField;
import org.springframework.stereotype.Repository;

import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;
import com.mymock.webproxy.domain.Wpheader;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
@Repository
public class WpHeaderRepository extends WpRepoBase<Wpheader, WpheaderRecord, TableField<WpheaderRecord,Integer>, com.mymock.webproxy.db.public_.tables.Wpheader> {

    public WpHeaderRepository() {
        super(com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER, com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER.ID, Wpheader.class);
    }
    
}
