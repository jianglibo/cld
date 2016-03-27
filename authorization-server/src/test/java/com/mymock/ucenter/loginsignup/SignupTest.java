package com.mymock.ucenter.loginsignup;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;

import com.google.common.collect.Sets;
import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.vo.PersonVo;

/**
 * 
 * 测试不同组合情况下服务器一侧的反应。比如用户名重复，缺失什么的。
 * 
 * @author jianglibo@gmail.com
 *
 */

public class SignupTest extends MvcHasOneUser {

    @Before
    public void before() {
        personRepo.deleteAll();
    }

    @After
    public void deleteData() {
        personRepo.deleteAll();
    }

    @Test
    public void testNeedCaptcha() throws Exception {
        PersonVo pvo6 = new PersonVo("你好啊zz11", "signupuser6", "sidsgnupUser6@xx.com", "13777447718", "666666", true, true, true, true, "", Sets.newHashSet());
        String c6 = getJsonString(pvo6);
        mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
                .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
                .content(c6)).andExpect(status().is2xxSuccessful()) // 期待返回的状态值是2开头的
                .andExpect(content().json("{message: \"WRONG_CAPTCHA\"}")); // 期待返回的内容是json
    }

    // /**
    // * 先设计一个SignupResult对象，根据不同的情况返回不同的状态。
    // * 你设定不同的PersonVo，比如缺了必要的字段，或者有重复的字段等等，检验一下结果是否和你预料的一致。
    // * @throws Exception
    // */
    // //添加新用户
    // @Test
    // public void testSignupSuccess() throws Exception {
    //
    // //添加中文用户名****成功
    // PersonVo pvo6 = new PersonVo("你好啊zz11", "signupuser6", "sidsgnupUser6@xx.com", "13777447718", "666666", true, true, true, true, "", Sets.newHashSet());
    // String c6 = getJsonString(pvo6);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c6))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"SUCCESS\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"http://www.xx.com\"}"));
    //
    // //添加新用户****成功
    // PersonVo pvo1 = new PersonVo("signupuser", "signupuser1", "signupUser1@xx.com", null, "111111", true, true, true, true, "", Sets.newHashSet());
    // String c1 = getJsonString(pvo1);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c1))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"SUCCESS\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"http://www.xx.com\"}"));
    //
    // }
    //
    // //测试重复
    // @Test
    // public void testSignupDuplicated() throws Exception{
    //// 用户名重复中文
    // PersonVo pvo2 = new PersonVo("你好啊zz11", "signupuser2", "11signupUser@xx.com", null, "222222", true, true, true, true, "", Sets.newHashSet());
    // String c2 = getJsonString(pvo2);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c2))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"DUPLICATED_USERNAME\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    // //用户名重复英文
    // PersonVo pvo3 = new PersonVo("signupuser", "signupuser3", "11signupUser3@xx.com", null, "3333", true, true, true, true, "", Sets.newHashSet());
    // String c3 = getJsonString(pvo3);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c3))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"DUPLICATED_USERNAME\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    // //邮件重复
    // PersonVo pvo7 = new PersonVo("signupuser77", "signupuser", "signupUser1@xx.com", null, "777777", true, true, true, true, "", Sets.newHashSet());
    // String c7 = getJsonString(pvo7);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c7))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"DUPLICATED_EMAIL\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    // //手机号重复
    // PersonVo pvo8 = new PersonVo("abcd8888", "signupuser", "sidsgnupUser@xx.com", "13777447718", "111111", true, true, true, true, "", Sets.newHashSet());
    // String c8 = getJsonString(pvo8);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c8))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"DUPLICATED_MOBILE\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    // }
    //
    // //测试非法输入
    // @Test
    // public void testSignupIllegal() throws Exception{
    // //非法用户名
    // PersonVo pvo4 = new PersonVo("si@3×&%user", "signupuser", "asignupUser4@xx.com", null, "444444", true, true, true, true, "", Sets.newHashSet());
    // String c4 = getJsonString(pvo4);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c4))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"ILLEGAL_USERNAME\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    // //非法用户名
    // PersonVo pvo5 = new PersonVo(" ", "signupuser", "sidsgnupUser5@xx.com", null, "555555", true, true, true, true, "", Sets.newHashSet());
    // String c5 = getJsonString(pvo5);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c5))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"ILLEGAL_USERNAME\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    // //非法邮箱
    // PersonVo pvo15 = new PersonVo("abcdefet", "signupuser", "sidsgnupUser5@xx.com@d", null, "555555", true, true, true, true, "", Sets.newHashSet());
    // String c15 = getJsonString(pvo15);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c15))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"ILLEGAL_EMAIL\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    // //非法手机号
    // PersonVo pvo25 = new PersonVo("32da5e", "signupuser", "dwdasidsgnupUser5@xx.com", "asd12389", "a2354245", true, true, true, true, "", Sets.newHashSet());
    // String c25 = getJsonString(pvo25);
    // mvc.perform(post("/login/signup").with(csrf()) // POST到指定路径
    // .contentType(MediaType.APPLICATION_JSON) // ContentType是application/json
    // .content(c25))
    // .andExpect(status().is2xxSuccessful()) //期待返回的状态值是2开头的
    // .andExpect(content().json("{message: \"ILLEGAL_MOBILE\"}")) // 期待返回的内容是json
    // .andExpect(content().json("{mailServer: \"\"}"));
    //
    //// }
    // }

}
