package com.mymock.ucenter.loginsignup;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;

import com.mymock.ucenter.MvcHasOneUser;

/**
 * 
 * 测试不同组合情况下服务器一侧的反应。比如用户名重复，缺失什么的。
 * 
 * @author jianglibo@gmail.com
 *
 */

public class PasswordRecoverTest extends MvcHasOneUser {

    @Before
    public void before() {
        personRepo.deleteAll();
    }

    @After
    public void deleteData() {
        personRepo.deleteAll();
    }

    @Test
    public void testEmailNotExist() throws Exception {
        //@formatter:off
        mvc.perform(post("/login/recover")
                .with(csrf())
                .content("{\"email\": \"a@b.c\"}")
                .contentType(MediaType.APPLICATION_JSON)
            ).andExpect(content().json("{message: \"EMAIL_NOT_EXIST\"}"));
      //@formatter:on
    }
    
    @Test
    public void testSendmail() throws Exception {
        getDefaultUser();
        //@formatter:off
        mvc.perform(post("/login/recover")
                .with(csrf())
                .content("{\"email\": \"" + getDefaultPersonVo().getEmail() + "\"}")
                .contentType(MediaType.APPLICATION_JSON)
            ).andExpect(content().json("{message: \"SUCCESS\"}"));
      //@formatter:on
    }
}
