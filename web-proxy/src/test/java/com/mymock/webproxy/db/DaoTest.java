/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.db;

import org.jooq.DSLContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.db.public_.tables.daos.HeaderDao;

/**
 * @author jianglibo@gmail.com
 *         2016年4月22日
 *
 */
public class DaoTest extends BaseForTt {
    
    @Autowired
    private HeaderDao dao;
    
    @Autowired
    private DSLContext create;

    @Test
    public void tfetch() {
        dao.fetchOneById(1);
    }
}
