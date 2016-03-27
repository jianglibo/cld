package com.mymock.ucenter.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.containsString;

import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;

import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.controller.LoginController.AuthenticationStatus;
import com.mymock.ucenter.domain.Person;

public class LoginTest extends MvcHasOneUser {

    @Before
    public void before() {
        getDefaultUser();
    }
    
    @Test
    public void testLoginEmailNotVerified() throws Exception {
        // 因为email没有验证，所以不通过。
        mvc.perform(post("/login").with(csrf())//
                .contentType(MediaType.APPLICATION_JSON)//
                .characterEncoding(StandardCharsets.UTF_8.name())//
                .content(getObjectMapper().writeValueAsString(new UnPwd(email, password))))//
                .andExpect(status().isOk())//
                .andExpect(content().json("{state: " + AuthenticationStatus.ANONYMOUS + "}"));
    }
    
    public void testLogin()  throws Exception {
        //现在email设置成已验证。
        Person p = getDefaultUser();
        p.setEmailVerified(true);
        personRepo.save(p);
        mvc.perform(post("/login").with(csrf())//
                .contentType(MediaType.APPLICATION_JSON)//
                .characterEncoding(StandardCharsets.UTF_8.name())//
                .content(getObjectMapper().writeValueAsString(new UnPwd(email, password))))//
                .andExpect(status().isOk())//
                .andExpect(content().json("{state: " + AuthenticationStatus.FULL + "}"))
                .andExpect(authenticated());

    }

    @Test
    public void testWithUserDetail() throws Exception {
        // @formatter:off
        mvc.perform(
                get("/login/state").with(user(createRandomPeople(1, "USER").get(0)))
                    .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{state: " + AuthenticationStatus.FULL + "}"))
                .andExpect(header().string("Content-Type", containsString(MediaType.APPLICATION_JSON_VALUE)));
        // @formatter:on
    }

    @Test
    public void testStatus() throws Exception {
        // @formatter:off
        mvc.perform(
                get("/login/state")
                    .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().json("{state: " + AuthenticationStatus.ANONYMOUS + "}"))
            .andExpect(header().string("Content-Type", containsString(MediaType.APPLICATION_JSON_VALUE)));
        // @formatter:on
    }
}
