package com.mymock.ucenter.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;

import com.mymock.ucenter.WithMockMvc;

public class UnAuthenticatedTest extends WithMockMvc {

	@Test
	public void testUnauthenticated() throws Exception {
        mvc.perform(get("/serverside/myenv")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(302));
	
	}
}

