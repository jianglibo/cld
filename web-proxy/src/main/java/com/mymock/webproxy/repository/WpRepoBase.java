/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */
package com.mymock.webproxy.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.SelectWhereStep;
import org.jooq.SortField;
import org.jooq.SortOrder;
import org.jooq.TableField;
import org.jooq.UpdatableRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.google.common.collect.Lists;

/**
 * @author jianglibo@gmail.com
 *         2016年4月25日
 *
 */
public abstract class WpRepoBase<D extends HasIdField, R extends UpdatableRecord<R>, F extends TableField<R, Integer>, T extends TableImpl<R>>
        implements PagingAndSortingRepository<D, Integer> {

    private T tb;

    @Autowired
    protected DSLContext create;

    private F idf;

    private Class<D> dclass;

    public WpRepoBase(T tb, F idf, Class<D> dclass) {
        this.tb = tb;
        this.idf = idf;
        this.dclass = dclass;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Object)
     */
    @Override
    public <S extends D> S save(S entity) {
        R r = create.newRecord(tb, entity);
        r.store();
        return r.into(entity);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Iterable)
     */
    @Override
    public <S extends D> Iterable<S> save(Iterable<S> entities) {
        List<R> rs = Lists.newArrayList();
        entities.forEach(e -> {
            rs.add(create.newRecord(tb, e));
        });
        int[] ids = create.batchStore(rs).execute();

        List<Integer> iids = Lists.newArrayList();
        for (int i : ids) {
            iids.add(i);
        }

        List<S> originEntities = Lists.newArrayList(entities);

        List<S> entityList = Lists.newArrayList(entities);

        Result<R> rrs = create.selectFrom(tb).where(idf.in(iids)).fetch();
        List<R> rList = Lists.newArrayList(rrs);

        for (int i = 0; i < rList.size(); i++) {
            entityList.add(rList.get(i).into(originEntities.get(i)));
        }

        return entityList;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
     */
    @Override
    public D findOne(Integer id) {
        return create.selectFrom(tb).where(idf.eq(id)).fetchOne().into(dclass);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#exists(java.io.Serializable)
     */
    @Override
    public boolean exists(Integer id) {
        return create.select(idf).where(idf.eq(id)).fetchAny() != null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#findAll()
     */
    @Override
    public Iterable<D> findAll() {
        return create.fetch(tb).into(dclass);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#findAll(java.lang.Iterable)
     */
    @Override
    public Iterable<D> findAll(Iterable<Integer> ids) {
        return create.select(tb.fields()).where(idf.in(Lists.newArrayList(ids))).fetch().into(dclass);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#count()
     */
    @Override
    public long count() {
        return new Long(create.select(DSL.count()).from(tb).fetchOne().into(Integer.class));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#delete(java.io.Serializable)
     */
    @Override
    public void delete(Integer id) {
        create.delete(tb).where(idf.eq(id)).execute();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(D entity) {
        create.delete(tb).where(idf.eq(entity.getId())).execute();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Iterable)
     */
    @Override
    public void delete(Iterable<? extends D> entities) {
        List<Integer> ilist = Lists.newArrayList();
        entities.forEach(e -> {
            ilist.add(e.getId());
        });
        create.delete(tb).where(idf.in(ilist)).execute();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.CrudRepository#deleteAll()
     */
    @Override
    public void deleteAll() {
        create.delete(tb).execute();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Sort)
     */
    @Override
    public Iterable<D> findAll(Sort sort) {
        return create.selectFrom(tb).orderBy(getSortFieldArray(sort)).fetch().into(dclass);
    }

    protected SortField<?>[] getSortFieldArray(Sort sort) {
        List<SortField<?>> sfs = Lists.newArrayList();
        sort.forEach(o -> {
            sfs.add(tb.fields(o.getProperty())[0].sort(o.getDirection() == Direction.ASC ? SortOrder.ASC : SortOrder.DESC));
        });
        return sfs.toArray(new SortField<?>[]{});
    };

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Pageable)
     */
    @Override
    public Page<D> findAll(Pageable pageable) {
        //@formatter:off
        List<D> content = Lists.newArrayList(create.selectFrom(tb)
                .orderBy(getSortFieldArray(pageable.getSort()))
                .limit(pageable.getPageSize())
                .offset(pageable.getOffset())
                .fetch()
                .into(dclass));
        return new PageImpl<>(content, pageable, count());
        //@formatter:on
    }

}
