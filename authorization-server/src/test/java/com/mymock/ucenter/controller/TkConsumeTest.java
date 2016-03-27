package com.mymock.ucenter.controller;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mymock.ucenter.MvcHasOneUser;

public class TkConsumeTest extends MvcHasOneUser {

    @Test
    public void testPut() throws JsonProcessingException, Exception {
        
        String jsonStr = getJsonString(createRandomPeople(1).get(0));
        // @formatter off
        mvc.perform(post("/tkconsumer")
                .with(csrf())
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonStr))
            .andExpect(status().isOk())
            .andDo(new ResultHandler() {
                @Override
                public void handle(MvcResult result) throws Exception {
                    printme(result.getResponse().getContentAsString());
                }
            });
        // @formatter on
    }

}
