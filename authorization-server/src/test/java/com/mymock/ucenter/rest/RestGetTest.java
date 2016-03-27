package com.mymock.ucenter.rest;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.utils.RegexMatcher;

public class RestGetTest extends MvcHasOneUser {
    
    @Before
    public void before() {
        getDefaultUser();
    }
    
    @Autowired
    private Environment env;
    
	@Test
	public void testFindByMobile() throws Exception {
		
        String apiPrefix = env.getProperty("spring.data.rest.base-uri");
        
		// @formatter:off
        mvc.perform(
                get(apiPrefix + "/people/search/findByMobile?mobile=jianglibo@gmail.com").with(user("jianglibo@gmail.com")))
                .andExpect(status().isOk())
                .andExpect(content().string(new RegexMatcher("^\\{\\s.*\\}$")));
        // @formatter:on
	}
	
	@Test
	public void testFindByEmail() throws Exception {
		
        String apiPrefix = env.getProperty("spring.data.rest.base-uri");
        
		// @formatter:off
        mvc.perform(
                get(apiPrefix + "/people/search/findByEmail?email=jianglibo@gmail.com").with(user("jianglibo@gmail.com")))
                .andExpect(status().isOk())
                .andExpect(content().json("{_embedded: {people: [{displayName: 'jianglibo'}]}}"));
        // @formatter:on
	}

}
