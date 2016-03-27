package com.mymock.ucenter.rest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.google.common.collect.Sets;
import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.domain.Person;
import com.mymock.ucenter.domain.Role;
import com.mymock.ucenter.utils.PersonVoBuilder;
import com.mymock.ucenter.vo.PersonVo;

public class ManyToManyTest extends MvcHasOneUser {
	
//	private String roleJson = "{\"_embedded\" : {\"roles\": [ {"+
//	      "\"version\" : 0,"+
//	      "\"createdAt\" : \"2015-06-21T06:57:29.227+0000\","+
//	      "\"name\" : \"ROLE_PERSON_MANAGER\","+
//	      "\"_links\" : {"+
//	        "\"self\" : {"+
//	          "\"href\" : \"http://localhost/api/v1/roles/%s\""+
//	        "}"+
//	      "}"+
//	    "}, {"+
//	      "\"version\" : 0,"+
//	      "\"createdAt\" : \"2015-06-21T06:57:29.258+0000\","+
//	      "\"name\" : \"ROLE_USER\","+
//	      "\"_links\" : {"+
//	        "\"self\" : {"+
//	          "\"href\" : \"http://localhost/api/v1/roles/%s\""+
//	        "}"+
//	      "}"+
//	    "} ]}}";
	
	
	@Before
	public void before() {
		personRepo.deleteAll();
		roleRepo.deleteAll();
	}
	
	@After
	public void after() {
		personRepo.deleteAll();
		roleRepo.deleteAll();
	}
	
	/**
	 * 原来有2个role，put之后应该变成一个role。
	 * @throws Exception
	 */
	@Test
	public void putRoleLinks() throws Exception {
		PersonVo pvo = new PersonVoBuilder().name("aa").password("hello").authorizes("person_manager", "user").build();
		personManager.createUser(pvo);
		
		Person person = personRepo.findByName("aa");
		
		Set<Role> roles = Sets.newHashSet(roleRepo.findAll());
		
		List<String> rns = roles.stream().map(r -> r.getName()).collect(Collectors.toList());
		List<Long> ids = roles.stream().map(r -> r.getId()).collect(Collectors.toList());
		
		
		assertThat(person.getRoles().size(), is(2));
		assertThat(rns, containsInAnyOrder("ROLE_PERSON_MANAGER", "ROLE_USER"));
		
//		"http://localhost/api/v1/people/1310720/roles";
		
		String ls = "{\"_links\":  {\"roles\": [{\"href\" : \"http://localhost/api/v1/roles/%s\"}]}}";
		
		ls = String.format(ls, ids.get(0));
		
		
		String uri = getRestUri("/people/%s/roles");
		uri = String.format(uri, person.getId());
		// @formatter:off
		// put will replace all roles。
		mvc.perform(put(uri).with(csrf())
				.with(user(pvo))
				.contentType(MediaType.APPLICATION_JSON).content(ls))
			.andExpect(status().is2xxSuccessful())
			.andDo(new ResultHandler() {
				@Override
				public void handle(MvcResult result) throws Exception {
					Person p = personRepo.findByName("aa");
					p.getRoles().contains("a");
					assertThat(p.getRoles().size(), is(1));
				}
			});
		// @formatter:on
	}
	
	/**
	 * 通过patch，应该增加一个role
	 * @throws Exception
	 */
	   @Test
	    public void patchRoleLinks() throws Exception {
	        PersonVo pvo = new PersonVoBuilder().name("aa").password("hello").authorizes("person_manager", "user").build();
	        personManager.createUser(pvo);
	        
	        Person person = personRepo.findByName("aa");
	        
	        Set<Role> roles = Sets.newHashSet(roleRepo.findAll());
	        
	        List<String> rns = roles.stream().map(r -> r.getName()).collect(Collectors.toList());
	        
	        assertThat(person.getRoles().size(), is(2));
	        assertThat(rns, containsInAnyOrder("ROLE_PERSON_MANAGER", "ROLE_USER"));
	        
//	      "http://localhost/api/v1/people/1310720/roles";
	        
	        Role r = new Role("ROLE_ANOTHER");
	        roleRepo.save(r);
	        
	        String ls = "{\"_links\":  {\"roles\": [{\"href\" : \"http://localhost/api/v1/roles/%s\"}]}}";
	        
	        ls = String.format(ls, r.getId());
	        
	        
	        String uri = getRestUri("/people/%s/roles");
	        uri = String.format(uri, person.getId());
	        // @formatter:off
	        // put will replace all roles。
	        mvc.perform(patch(uri).with(csrf())
	                .with(user(pvo))
	                .contentType(MediaType.APPLICATION_JSON).content(ls))
	            .andExpect(status().is2xxSuccessful())
	            .andDo(new ResultHandler() {
	                @Override
	                public void handle(MvcResult result) throws Exception {
	                    Person p = personRepo.findByName("aa");
	                    p.getRoles().contains("a");
	                    assertThat(p.getRoles().size(), is(3));
	                }
	            });
	        // @formatter:on
	    }       

}

