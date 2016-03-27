package com.mymock.ucenter;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.repository.PersonRepository;
import com.mymock.ucenter.repository.RoleRepository;
import com.mymock.ucenter.vo.PersonVo;

public abstract class MvcHasOneUser extends ItBase {

    
    protected MockMvc mvc;
    
    protected String email = "jianglibo@gmail.com";
    
    protected String password = "randompwd";
    
    protected String mobile = "13575491197";
    
    @Autowired
    protected PersonRepository personRepo;

    @Autowired
    protected PersonManager personManager;
    
    @Autowired
    protected RoleRepository roleRepo;
    
    protected Person getDefaultUser() {
        Person p = personRepo.findByEmail(email);
        
        if (p != null) {
            return p;
        }
        PersonVo personVo = new PersonVo("jianglibo","jianglibo", email, mobile, password, true, true, true, true, null, Lists.newArrayList());
        personManager.createUser(personVo);
        return personRepo.findByEmail(email);
    }
    
    protected PersonVo getDefaultPersonVo() {
        return new PersonVo(getDefaultUser());
    }

    @Before
    public void defaultBefore() {
        mvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();
    }
    
    @After
    public void defaultAfter() {
        mvc = null;
    }
    
    public <T> String getJsonString(T o) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(o);
    }
    
    public <T> T getObFromJsonStr(String jsonstr, Class<T> clazz) throws IOException {
        return new ObjectMapper().readValue(jsonstr, clazz);
    }
    
    @Transactional
    public List<PersonVo> createRandomPeople(int num, String...authorizes) {
    	
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        
        Set<GrantedAuthority> gaus = Stream.of(authorizes)
        		.map(au -> au.startsWith("ROLE_") ? au : "ROLE_" + au)
        		.map(gn -> new SimpleGrantedAuthority(gn)).collect(Collectors.toSet());
        
        return IntStream.range(0, num).mapToObj(i -> createOnePvo(uuid, i, gaus)).map(pvo -> {
            personManager.createUser(pvo);
            return pvo;
            }).collect(Collectors.toList());
    }
    
    public void deleteUsers(List<PersonVo> pps) {
        pps.stream().map(pvo -> personRepo.findByEmail(pvo.getEmail())).forEach(p -> personRepo.delete(p.getId()));
    }

    private PersonVo createOnePvo(String uuid, int i, Collection<GrantedAuthority> authorizes) {
        String uid = uuid + i;
        if (authorizes.isEmpty()) {
        	authorizes.add(new SimpleGrantedAuthority("USER"));
        }
        return new PersonVo(uid,uid, uid + "@openscanner.cc", null, uuid,true,true,true,true,"",authorizes);
    }
    
    protected static class UnPwd {
        private String username;
        private String password;
        
        public UnPwd(String username, String password) {
            super();
            this.username = username;
            this.password = password;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        
    }
}
