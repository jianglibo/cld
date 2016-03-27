package com.mymock.ucenter.repository;

import java.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mymock.ucenter.ItBase;
import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.Role;
import com.mymock.ucenter.domain.ThirdPartLogin;
import com.mymock.ucenter.domain.ThirdPartLogin.Provider;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.repository.RoleRepository;
import com.mymock.ucenter.repository.ThirdPartLoginRepository;
import com.mymock.ucenter.vo.PersonVo;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class PersonRepositoryTest extends ItBase {

    private Logger logger = LoggerFactory.getLogger(PersonRepositoryTest.class);

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private PersonManager personManager;
    
    @Autowired
    private ThirdPartLoginRepository thirdplRepo;
    
    @Autowired
    private RoleRepository roleRepo;


    @Before
    public void before() {
        personRepo.deleteAll();
        thirdplRepo.deleteAll();
        roleRepo.deleteAll();
    }

    @After
    public void after() {
        personRepo.deleteAll();
        thirdplRepo.deleteAll();
        roleRepo.deleteAll();
    }

    @Test
    public void createPerson() {
        PersonVo personVo = new PersonVo("jianglibo","jianglibo@gmail.com", "13575491197", "password");
        personManager.createUser(personVo);
        long num = personRepo.count();
        assertThat(num, is(1L));

        Person person = personRepo.findByEmail("jianglibo@gmail.com");
        logger.info("encoded password is {}", person.getPassword());
        assertThat(personVo.getPassword(), not(person.getPassword()));
    }
    
    @Test
    public void createPersonWithRole() {
        Set<GrantedAuthority> gas = Sets.newHashSet(new SimpleGrantedAuthority("ADMIN")); 
        PersonVo personVo = new PersonVo("jianglibo","jianglibo", "jianglibo@gmail.com", "13575491197", "password", null, gas);
        personManager.createUser(personVo);
        
        long num = personRepo.count();
        assertThat(num, is(1L));
        
        assertThat(roleRepo.count(), is(2L)); //ROLE_USER is default created
        
        assertThat(roleRepo.findAll().iterator().next().getName(), is("ROLE_ADMIN"));
    }

    
    @Test
    public void createPersonWithRole2() {
        Set<GrantedAuthority> gas = Sets.newHashSet(new SimpleGrantedAuthority("ROLE_ADMIN")); 
        PersonVo personVo = new PersonVo("jianglibo","jianglibo", "jianglibo@gmail.com", "13575491197", "password", null, gas);
        PersonVo personVo1 = new PersonVo("jianglibo1","jianglibo1", "jianglibo1@gmail.com", "135754911971", "password", null, gas);
        personManager.createUser(personVo);
        personManager.createUser(personVo1);
        long num = personRepo.count();
        assertThat(num, is(2L));
        
        assertThat(roleRepo.count(), is(2L)); //ROLE_USER create by default.
        
        boolean hasAdmin = false;
        Iterator<Role> it = roleRepo.findAll().iterator();
        
        while(it.hasNext()) {
        	if ("ROLE_ADMIN".equals(it.next().getName())) {
        		hasAdmin = true;
        		break;
        	}
        }
        assertThat(hasAdmin, is(true));
    }

    @Test
    public void createThirdPartLogin() {
        PersonVo personVo = new PersonVo("jianglibo","jianglibo", "jianglibo@gmail.com", "13575491197", "password", null, Lists.newArrayList());
        personManager.createUser(personVo);
        
        Person person = personRepo.findByEmail("jianglibo@gmail.com");
        
        ThirdPartLogin thirdpl = new ThirdPartLogin();
        thirdpl.setProvider(Provider.QQ);
        thirdpl.setCreatedAt(Date.from(Instant.now()));
        thirdpl.setOpenId("aaa");
        thirdpl.setPerson(person);
        thirdpl = thirdplRepo.save(thirdpl);
        
        person.getThirdConns().add(thirdpl);
        
        
        assertThat(person.getThirdConns().stream().findFirst().get().getOpenId(), is("aaa"));
        
        assertThat(personRepo.findByThirdPartLoginId(thirdpl), notNullValue());
    }
    
}
