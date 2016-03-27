package com.mymock.ucenter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mymock.ucenter.domain.Role;

@RepositoryRestResource(collectionResourceRel = "roles", path = "roles")
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

    Role findByName(String rn);

//	@Query(value = "SELECT p from Person as p WHERE p.name LIKE :name")
//	List<Person> findByLastName(@Param("name") String name);

//    ThirdPartLogin findByProviderAndOpenId(Provider provider, String openId);

}
