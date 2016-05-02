package com.mymock.webproxy.repository;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.jooq.DSLContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AbstractPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.google.common.collect.Lists;
import com.mymock.webproxy.BaseForTt;
import com.mymock.webproxy.domain.Wpurl;

import static com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;;

public class WpUrlRepositoryTest extends BaseForTt {

    @Autowired
    public WpUrlRepository urlRepo;
    
    @Autowired
    public WpUrlRepository urlRepo1;
    
    @Autowired
    private DSLContext create;
    
    @Before
    public void bf() {
        create.delete(WPURL).execute();
    }
    
    @Test
    public void saveOne() {
        Wpurl url = new Wpurl();
        url.setAddress("hello");
        url = urlRepo.save(url);
        assertThat(url.getId(), greaterThan(0));
    }
    
    @Test
    public void saveMany() {
        List<Wpurl> urls = Lists.newArrayList();
        
        for(int i = 0; i< 100; i++) {
            Wpurl url = new Wpurl();
            url.setAddress("hello" + i);
            urls.add(url);
        }
        urlRepo.save(urls);
        assertThat(urlRepo.count(), equalTo(100L));
    }

    @Test
    public void sort() {
        List<Wpurl> urls = Lists.newArrayList();
        
        for(int i = 0; i< 100; i++) {
            Wpurl url = new Wpurl();
            url.setAddress("hello" + i);
            urls.add(url);
        }
        urlRepo.save(urls);
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, WPURL.ADDRESS.getName()));
        Iterable<Wpurl> sorted = urlRepo.findAll(sort);
        assertThat(sorted.iterator().next().getAddress(), equalTo("hello0"));
        
        sort = new Sort(new Sort.Order(Sort.Direction.DESC, WPURL.ADDRESS.getName()));
        sorted = urlRepo.findAll(sort);
        assertThat(sorted.iterator().next().getAddress(), equalTo("hello99"));
    }
    
    @Test
    public void pageable() {
        List<Wpurl> urls = Lists.newArrayList();
        
        for(int i = 0; i< 100; i++) {
            Wpurl url = new Wpurl();
            url.setAddress("hello" + i);
            urls.add(url);
        }
        urlRepo.save(urls);
        
        Pageable pp = new MyPageable(0, 10);
        
        Page<Wpurl> firstPage = urlRepo.findAll(pp);
        
        assertThat(firstPage.getTotalElements(), equalTo(100L));
        assertThat(firstPage.getTotalPages(), equalTo(10));
        assertThat(firstPage.getContent().get(0).getAddress(), equalTo("hello0"));
        assertThat(firstPage.getContent().get(9).getAddress(), equalTo("hello17"));
    }
    
    private static class MyPageable extends AbstractPageRequest {

        /**
         * 
         */
        private static final long serialVersionUID = 1622808910904728212L;

        public MyPageable(int page, int size) {
            super(page, size);
        }

        @Override
        public Sort getSort() {
        return new Sort(new Sort.Order(Sort.Direction.ASC, WPURL.ADDRESS.getName()));
        }

        @Override
        public Pageable next() {
            return null;
        }

        @Override
        public Pageable previous() {
            return null;
        }

        @Override
        public Pageable first() {
            return null;
        }
        
    }
}
