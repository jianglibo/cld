package com.mymock.ucenter.jpa;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mymock.ucenter.MvcHasOneUser;

public class DeleteManyToManyTest extends MvcHasOneUser {
	
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

	
	@Test
	public void deletePersonHasRole() {
		createRandomPeople(10, "USER");
		
		assertThat(personRepo.count(), is(10L));
		assertThat(roleRepo.count(), is(1L));
	}
}

