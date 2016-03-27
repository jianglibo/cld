package com.mymock.ucenter.oauth;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;




import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;

import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.utils.OauthConstants;

public class PasswordGrantTest extends MvcHasOneUser {
    
    private String clientName = "my-password-client";
    
//    {"access_token":"f08565fd-8bf7-4263-9676-0a4faeeb0a8f","token_type":"bearer","expires_in":59,"scope":"read write trust"}
    
    @Before
    public void before() {
        getDefaultUser();
    }
    
    @Test
    public void testGetToken() throws Exception {
        
        // @formatter:off
        mvc.perform(post(OauthConstants.URL_OAUTH_TOKEN).with(csrf())
                        .param(OauthConstants.PNAME_CLIENT_ID, clientName)
                        .param(OauthConstants.PNAME_USERNAME, email)
                        .param(OauthConstants.PNAME_PASSWORD, password)
                        .param(OauthConstants.PNAME_GRANT_TYPE, OauthConstants.GRANT_TYPE_PASSWORD)
                        .with(httpBasic(clientName, "secret"))
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED))
             .andExpect(status().isOk())
             .andExpect(content().json("{token_type: \"bearer\"}"));
        // @formatter:on
    }

}
