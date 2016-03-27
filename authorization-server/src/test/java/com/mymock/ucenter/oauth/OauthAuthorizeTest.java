package com.mymock.ucenter.oauth;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Sets;
import com.google.common.net.HttpHeaders;
import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.utils.BasicAuthenticationHeader;
import com.mymock.ucenter.utils.OauthConstants;
import com.mymock.ucenter.vo.PersonVo;


/**
 * 
 * @author jianglibo@gmail.com
 *
 */

public class OauthAuthorizeTest extends MvcHasOneUser {

    @Test
    public void testOac() throws Exception {
        appConfig.getOauthClients().stream().filter(oc -> {
            String[] agts = oc.getAuthorizedGrantTypes();
            Set<String> agtset = Sets.newHashSet(agts);
            return agtset.contains("authorization_code"); // 仅仅测试类型是authorization_code的。
        }).forEach(oc -> {
            try {
                String[] rds = oc.getRedirectUris();
                String rd = "";
                if (rds != null && rds.length > 0) {
                    rd = rds[0];
                }
                testAuthorizer(oc.getClient(), oc.getSecret(), rd);
            } catch (Exception e) {
                assertTrue(oc.getClient() + " test failed.", false);
            }
        });

    }

    private void testAuthorizer(String client_id, String client_secret, String redirectUrl) throws Exception {
        PersonVo pvo = createRandomPeople(1).get(0);
        String url = "/oauth/authorize?client_id=" + client_id + "&redirect_uri=" + redirectUrl//
                + "&response_type=code&scope=openid&state=123456";

        mvc.perform(get(url).with(user(pvo))) // 用户必须登录之后才能访问这个路径，那么也就是说必须从服务器-》服务器的访问。
                .andDo(new ResultHandler() {
                    @Override
                    public void handle(MvcResult result) throws Exception {

                        int status = result.getResponse().getStatus();
                        assertThat(client_id + " status should be 3xx.", String.valueOf(status), startsWith("3"));
                        // .andExpect(status().is3xxRedirection())//
                        // .andExpect(header().string("Location", startsWith(redirectUrl + "?code=")))//
                        // .andExpect(header().string("Location", endsWith("&state=123456")))//

                        String location = result.getResponse().getHeader(HttpHeaders.LOCATION);
                        Matcher m = Pattern.compile(".*code=(.*?)&.*").matcher(location);
                        assertThat(m.matches(), is(true));
                        String code = m.group(1);
                        assertThat(code, notNullValue());

                        BasicAuthenticationHeader bah = new BasicAuthenticationHeader(client_id, client_secret);

                        mvc.perform(post(OauthConstants.URL_OAUTH_TOKEN).with(csrf())//
                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)//
                                .param(OauthConstants.PNAME_CLIENT_ID, client_id)//
                                .param(OauthConstants.PNAME_CLIENT_SECRET, client_secret)//
                                .param(OauthConstants.PNAME_REDIRECT_URI, redirectUrl)//
                                .param(OauthConstants.PNAME_CODE, m.group(1))//
                                .param(OauthConstants.PNAME_GRANT_TYPE, OauthConstants.GRANT_TYPE_AUTHORIZATION_CODE)//
                                .header(bah.getHeaderName(), bah.getHeaderValue())).andExpect(status().isOk())
                                // .andExpect(header().string("location", startsWith(prefix)))
                                .andExpect(content()//
                                        .json("{scope: \"openid\", token_type: \"bearer\"}"))//
                                .andDo(new ResultHandler() {
                            @Override
                            public void handle(MvcResult result) throws Exception {
                                String c = result.getResponse().getContentAsString();
                                // {access_token=00e8a863-68a5-41e0-98b5-eb6d603504e0, scope=openid, token_type=bearer, expires_in=43199}
                                // printme(c);
                                ObjectMapper om = new ObjectMapper();
                                Map<String, Object> map = om.readValue(c, new TypeReference<HashMap<String, Object>>() {
                                });
                                String access_token = (String) map.get("access_token");
                                assertThat(access_token, notNullValue());
                                assertThat(map.get("expires_in"), notNullValue());

                                mvc.perform(get("/me?access_token=" + access_token))//
                                        .andExpect(status().isOk())//
                                        .andDo(new ResultHandler() {

                                    @Override
                                    public void handle(MvcResult result) throws Exception {
                                        String c = result.getResponse().getContentAsString();
                                        printme(c);
                                    }
                                });
                            }
                        });
                    }
                });
    }
}
