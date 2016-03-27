package com.mymock.ucenter.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.ThirdPartLogin;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    // List<Person> findByLastName(@Param("name") String name);

    // @PreAuthorize("hasRole('RRR')")
    // @Secured("ROLE_TELLER")
    Person findByEmail(@Param("email") String email);

    // @PreAuthorize("hasRole('RRR')")
    // @Secured("ROLE_TELLER")
    Person findByMobile(@Param("mobile") String mobile);

    Person findByName(@Param("name") String name);

    @Override
    @RestResource(exported = false)
    @Transactional
    public <S extends Person> S save(S entity);
    
    @Override
    @RestResource(exported = false)
    public void delete(Person entity);

    @Override
    // @PreAuthorize("hasRole('PERSON_MANAGER') or (#id == principal.id)")
    // @P("id")
    // move security check to web access config.
    public Person findOne(Long personId);

    @Query(value = "SELECT p from Person p WHERE :tpl MEMBER OF p.thirdConns")
    Person findByThirdPartLoginId(@Param("tpl") ThirdPartLogin tpl);

}
