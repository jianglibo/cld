package com.mymock.ucenter.rest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.mymock.ucenter.MvcHasOneUser;
import com.mymock.ucenter.utils.HalFields;
import com.mymock.ucenter.vo.PersonVo;

public class PersonRestTest extends MvcHasOneUser {

    @Before
    public void before() {
        personRepo.deleteAll();
        getDefaultUser();
    }

    @After
    public void after() {
        personRepo.deleteAll();
    }

    /**
     * 因为personRepository的save方法没有export，所以不允许通过rest界面添加，更改，删除用户。返回405，不支持的方法。
     * @throws Exception
     */
    @Test
    @WithMockUser(username = "jianglibo", roles = { "PERSON_MANAGER", "USER" })
    public void cannotCreateViaRestPost() throws Exception {
        String uri = getRestUri("/people");

        // @formatter:off
        mvc.perform(
                post(uri)
                    .with(csrf())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(getJsonString(new PersonVo()))
                ).andExpect(status().is(405));
        
        mvc.perform(
                delete(uri)
                    .with(csrf())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(getJsonString(new PersonVo()))
                ).andExpect(status().is(405));
        
        mvc.perform(
                put(uri)
                    .with(csrf())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(getJsonString(new PersonVo()))
                ).andExpect(status().is(405));

        // @formatter:on
    }

    /**
     * access one person.
     * @throws Exception
     */
    @Test
    public void canGetOneByRoleUser() throws Exception {
        String uri = getRestUri("/people/" + getDefaultPersonVo().getId());
        // @formatter:off
        // 这里用tperson的身份去访问自己的资料，允许。
        mvc.perform(get(uri).with(user(getDefaultPersonVo())))
            .andExpect(status().isOk())
            .andDo(new ResultHandler() {
                @Override
                public void handle(MvcResult result) throws Exception {
                    System.out.println(result.getResponse().getContentAsString());    
                }
            });
        // 默认不支持patch方法。
        mvc.perform(patch(uri)
                .with(user(getDefaultPersonVo()))
                .contentType(MediaType.APPLICATION_JSON)
                .content(getJsonString(getDefaultPersonVo())))
                .andExpect(status().is(405));
        // @formatter:on
    }
    
    /**
     * PERSON_MANAGER允许访问单个用户资料
     * @throws Exception
     */
    @Test
    public void canGetOneByRolePersonManager() throws Exception {
        String uri = getRestUri("/people/" + getDefaultPersonVo().getId());

        // @formatter:off
        mvc.perform(get(uri)
                .with(
                user(getDefaultPersonVo())))
                .andExpect(status().isOk())
                .andDo(new ResultHandler() {
                    @Override
                    public void handle(MvcResult result) throws Exception {
                        System.out.println(result.getResponse().getContentAsString());    
                    }
                });
        // @formatter:on
    }


    /**
     * 如果登录用户的id和要操作的person的id不一样，访问必须拒绝。
     * @throws Exception
     */
    @Test
    public void getOneShouldDenied() throws Exception {
        String uri = getRestUri("/people/" + getDefaultPersonVo().getId());
        PersonVo pv = createRandomPeople(1).get(0);
        // @formatter:off
        mvc.perform(get(uri)
                .with(user(pv)))
                .andExpect(status().is4xxClientError());
        // @formatter:on
    }
    
    /**
     * 如果登录用户的id和要操作的person的id不一样，但是具有PERSON_MANAGER角色，则可以。
     * @throws Exception
     */
    @Test
    public void getOneShouldAllowedByManager() throws Exception {
        String uri = getRestUri("/people/" + getDefaultPersonVo().getId());
        
        PersonVo pv = createRandomPeople(1, "ROLE_PERSON_MANAGER", "ROLE_USER").get(0);

        // @formatter:off
        mvc.perform(get(uri)
                .with(user(pv)))
                .andExpect(status().isOk());
        // @formatter:on
    }

    
    

    /**
     * 默认支持分页，新建10个用户，然后用size 5去访问，结果应该是5个。
     * @throws Exception
     */
    @Test
    @WithMockUser(username = "jianglibo", roles = { "PERSON_MANAGER", "USER" })
    public void canGetList() throws Exception {
        String uri = getRestUri("/people");
        List<PersonVo> pps = createRandomPeople(10);
        // @formatter:off
        mvc.perform(get(uri).param("size", "5"))
            .andExpect(status().isOk())
            .andDo(new ResultHandler() {
                @Override
                public void handle(MvcResult result) throws Exception {
                    String content = result.getResponse().getContentAsString();
                    JsonNode jn = new ObjectMapper().readTree(content);
                    JsonNode people = jn.get(HalFields._EMBEDDED).get("people");
                    Assert.assertTrue(people.getNodeType() == JsonNodeType.ARRAY);
                    
                    assertThat(people.size(), is(5));
                    
                    deleteUsers(pps);
                }
            });
        // @formatter:on
    }

    // {
    // "version" : 0,
    // "createdAt" : "2015-06-18T06:28:00.097+0000",
    // "displayName" : "jianglibo",
    // "avatar" : null,
    // "name" : "jianglibo",
    // "email" : "jianglibo@gmail.com",
    // "mobile" : "13575491197",
    // "accountNonExpired" : true,
    // "accountNonLocked" : true,
    // "credentialsNonExpired" : true,
    // "enabled" : true,
    // "roleAuthorities" : [ ],
    // "_links" : {
    // "self" : {
    // "href" : "http://localhost/api/v1/people/425"
    // },
    // "roles" : {
    // "href" : "http://localhost/api/v1/people/425/roles"
    // },
    // "thirdConns" : {
    // "href" : "http://localhost/api/v1/people/425/thirdConns"
    // }
    // }
    // }

    // {
    // "_links" : {
    // "self" : {
    // "href" : "http://localhost/api/v1/people{?page,size,sort}",
    // "templated" : true
    // },
    // "search" : {
    // "href" : "http://localhost/api/v1/people/search"
    // }
    // },
    // "_embedded" : {
    // "people" : [ {
    // "version" : 0,
    // "createdAt" : "2015-06-18T05:52:03.843+0000",
    // "displayName" : "ucenter",
    // "avatar" : null,
    // "name" : "ucenter",
    // "email" : "jianglb@openscanner.cn",
    // "mobile" : null,
    // "accountNonExpired" : true,
    // "accountNonLocked" : true,
    // "credentialsNonExpired" : true,
    // "enabled" : true,
    // "roleAuthorities" : [ {
    // "authority" : "PERSON_MANAGER"
    // } ],
    // "_links" : {
    // "self" : {
    // "href" : "http://localhost/api/v1/people/409"
    // },
    // "roles" : {
    // "href" : "http://localhost/api/v1/people/409/roles"
    // },
    // "thirdConns" : {
    // "href" : "http://localhost/api/v1/people/409/thirdConns"
    // }
    // }
    // }, {
    // "version" : 0,
    // "createdAt" : "2015-06-18T06:27:59.336+0000",
    // "displayName" : "jianglibo",
    // "avatar" : null,
    // "name" : "jianglibo",
    // "email" : "jianglibo@gmail.com",
    // "mobile" : "13575491197",
    // "accountNonExpired" : true,
    // "accountNonLocked" : true,
    // "credentialsNonExpired" : true,
    // "enabled" : true,
    // "roleAuthorities" : [ ],
    // "_links" : {
    // "self" : {
    // "href" : "http://localhost/api/v1/people/423"
    // },
    // "roles" : {
    // "href" : "http://localhost/api/v1/people/423/roles"
    // },
    // "thirdConns" : {
    // "href" : "http://localhost/api/v1/people/423/thirdConns"
    // }
    // }
    // } ]
    // },
    // "page" : {
    // "size" : 20,
    // "totalElements" : 2,
    // "totalPages" : 1,
    // "number" : 0
    // }
    // }

}
