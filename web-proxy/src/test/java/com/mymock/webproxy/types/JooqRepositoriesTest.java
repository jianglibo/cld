package com.mymock.webproxy.types;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map.Entry;

import org.jooq.DSLContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.db.public_.tables.Wpurl;
import com.mymock.webproxy.db.public_.tables.records.WpurlRecord;
import com.mymock.webproxy.repository.JooqRepositories;
import com.mymock.webproxy.repository.WpRepoBase;

public class JooqRepositoriesTest extends BaseForTt {

    @Autowired
    private JooqRepositories repositories;
    
    @Autowired
    private DSLContext create;
    
    private WpurlRecord wr;
    
    @Before
    public void bf() {
        create.delete(Wpurl.WPURL).execute();
        wr = create.insertInto(Wpurl.WPURL, Wpurl.WPURL.ADDRESS).values("aabb").returning().fetchOne();
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void num() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (Entry<String, WpRepoBase> en : repositories.getRepos().entrySet()) {
            WpRepoBase wb = en.getValue();
            Method[] mds = wb.getClass().getMethods();
            for(Method m: mds) {
                if ("findOne".equals(m.getName())) {
                    Object o = m.invoke(wb, wr.getId());
                    printme(o);
                }
//              m.invoke(obj, args)
            }
            printme(wb.getClass());
        }
    }
}
