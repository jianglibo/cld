package com.mymock.ucenter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mymock.ucenter.domain.ThirdPartLogin;
import com.mymock.ucenter.domain.ThirdPartLogin.Provider;

@RepositoryRestResource(collectionResourceRel = "thirdpl", path = "thirdpl")
public interface ThirdPartLoginRepository extends PagingAndSortingRepository<ThirdPartLogin, Long> {

//	@Query(value = "SELECT p from Person as p WHERE p.name LIKE :name")
//	List<Person> findByLastName(@Param("name") String name);

    ThirdPartLogin findByProviderAndOpenId(Provider provider, String openId);

}
