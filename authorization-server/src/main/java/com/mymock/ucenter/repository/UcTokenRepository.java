package com.mymock.ucenter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mymock.ucenter.domain.UcToken;

@RepositoryRestResource(collectionResourceRel = "uctokens", path = "uctokens")
public interface UcTokenRepository extends PagingAndSortingRepository<UcToken, Long> {

    UcToken findByTk(String tk);

    @Override
    @RestResource(exported = false)
    public Iterable<UcToken> findAll();

    @Override
    @RestResource(exported = false)
    public UcToken findOne(Long id);

    @Override
    @RestResource(exported = false)
    public <S extends UcToken> S save(S entity);
}
