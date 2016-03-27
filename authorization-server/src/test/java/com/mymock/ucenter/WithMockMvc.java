package com.mymock.ucenter;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mymock.ucenter.config.userdetail.PersonManager;
import com.mymock.ucenter.repository.PersonRepository;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.*;


public abstract class WithMockMvc extends ItBase {

    
    protected MockMvc mvc;
    
    
    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private PersonManager personManager;


    @Before
    public void defaultSetup() {
        mvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();
    }
    
    @After
    public void defaultAfter() {
        mvc = null;
    }

}
