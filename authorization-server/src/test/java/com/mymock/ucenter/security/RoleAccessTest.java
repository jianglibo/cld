package com.mymock.ucenter.security;



import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

import com.mymock.ucenter.MvcHasOneUser;

public class RoleAccessTest  extends MvcHasOneUser {

	@Test
	public void testAuthorizer() throws Exception {
		// @formatter:off
        mvc.perform(
                get("/authenticated").with(user("jianglibo").roles("USER")))
                .andExpect(status().isOk());
        // @formatter:on
	}

}