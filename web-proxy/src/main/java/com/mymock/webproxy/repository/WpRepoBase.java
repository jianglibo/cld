/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.TableField;
import org.jooq.UpdatableRecord;
import org.jooq.impl.TableImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.google.common.collect.Lists;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public class WpRepoBase<D, R extends UpdatableRecord<R>,F extends TableField<R, Integer>, T extends TableImpl<R>> implements PagingAndSortingRepository<D, Integer> {
    
    private T ti;
    
    @Autowired
    protected DSLContext create;
    
    private F idf;
    
    private Class<D> dclass;
    
    public WpRepoBase(T ti, F idf, Class<D> dclass) {
         this.ti = ti;
         this.idf = idf;
         this.dclass = dclass;
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Object)
     */
    @Override
    public <S extends D> S save(S entity) {
        R r = create.newRecord(ti, entity);
        r.store();
        return r.into(entity);
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Iterable)
     */
    @Override
    public <S extends D> Iterable<S> save(Iterable<S> entities) {
        List<R> rs = Lists.newArrayList();
        entities.forEach(e -> {
            rs.add(create.newRecord(ti, e));
        });
        int[] ids = create.batchStore(rs).execute();
        List<Integer> iids = Lists.newArrayList();
        for(int i : ids) {
            iids.add(i);
        }
        return (Iterable<S>) create.selectFrom(ti).where(idf.in(iids)).fetch().into(dclass);
    }
    

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
     */
    @Override
    public D findOne(Integer id) {
        return create.selectFrom(ti).where(idf.eq(id)).fetchOne().into(dclass);
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#exists(java.io.Serializable)
     */
    @Override
    public boolean exists(Integer id) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#findAll()
     */
    @Override
    public Iterable<D> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#findAll(java.lang.Iterable)
     */
    @Override
    public Iterable<D> findAll(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#count()
     */
    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#delete(java.io.Serializable)
     */
    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(D entity) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Iterable)
     */
    @Override
    public void delete(Iterable<? extends D> entities) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#deleteAll()
     */
    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Sort)
     */
    @Override
    public Iterable<D> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Pageable)
     */
    @Override
    public Page<D> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

}
