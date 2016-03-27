package com.mymock.ucenter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mymock.ucenter.domain.LoginAttempt;

@RepositoryRestResource(collectionResourceRel = "loginattempt", path = "loginattempts")
public interface LoginAttemptRepository  extends PagingAndSortingRepository<LoginAttempt, Long> {

}
