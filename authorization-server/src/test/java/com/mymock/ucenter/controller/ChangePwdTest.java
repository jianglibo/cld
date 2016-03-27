package com.mymock.ucenter.controller;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;

import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.controller.SignupController.ChangePwdVo;
import com.mymock.ucenter.utils.CommonRoleNames;

public class ChangePwdTest extends MvcHasOneUser {
	
    @Before
    public void before() {
        personRepo.deleteAll();
        getDefaultUser();
    }
	
    @Test
    public void changePwdTest() throws Exception {  
        
        assertHasSameAuthories(getDefaultPersonVo().getAuthorities(), CommonRoleNames.ROLE_USER);
    	ChangePwdVo cp1 = new ChangePwdVo();
    	cp1.setOldpwd("randompwd1");
    	cp1.setNewpwd("123456");
    	cp1.setRenewpwd("123456");
	    String c1 = getJsonString(cp1);
	    
	    mvc.perform(post("/login/changepwd").with(csrf())
	    		.with(user(getDefaultPersonVo()))
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(c1))
	        .andExpect(status().is2xxSuccessful()) 
	        .andExpect(content().json("{message: \"WRONG_OLDPWD\"}"));
	    
	    ChangePwdVo cp2 = new ChangePwdVo();
    	cp2.setOldpwd("randompwd");
    	cp2.setNewpwd("1234567");
    	cp2.setRenewpwd("123456");
	    String c2 = getJsonString(cp2);
	    mvc.perform(post("/login/changepwd").with(csrf())
	    		.with(user(getDefaultPersonVo()))
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(c2))
	        .andExpect(status().is2xxSuccessful()) 
	        .andExpect(content().json("{message: \"DIFF_NEWPWD\"}"));
    	
    	ChangePwdVo cp3 = new ChangePwdVo();
    	cp3.setOldpwd("randompwd");
    	cp3.setNewpwd("123456");
    	cp3.setRenewpwd("123456");
	    String c3 = getJsonString(cp3);
	    mvc.perform(post("/login/changepwd").with(csrf())
	    		.with(user(getDefaultPersonVo()))
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(c3))
	        .andExpect(status().is2xxSuccessful()) 
	        .andExpect(content().json("{message: \"SUCCESS\"}"));
	    
    	ChangePwdVo cp4 = new ChangePwdVo();
    	cp4.setOldpwd("123456");
    	cp4.setNewpwd("aaaaaa");
    	cp4.setRenewpwd("aaaaaa");
	    String c4 = getJsonString(cp4);
	    mvc.perform(post("/login/changepwd").with(csrf())
	    		.with(user(getDefaultPersonVo()))
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(c4))
	        .andExpect(status().is2xxSuccessful()) 
	        .andExpect(content().json("{message: \"SUCCESS\"}"));
	    
    }
}

