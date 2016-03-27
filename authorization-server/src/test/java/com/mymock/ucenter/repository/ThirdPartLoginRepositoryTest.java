package com.mymock.ucenter.repository;

import java.time.Instant;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mymock.ucenter.ItBase;
import com.mymock.ucenter.domain.ThirdPartLogin;
import com.mymock.ucenter.domain.ThirdPartLogin.Provider;
import com.mymock.ucenter.repository.ThirdPartLoginRepository;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ThirdPartLoginRepositoryTest extends ItBase {

    private Logger logger = LoggerFactory.getLogger(ThirdPartLoginRepositoryTest.class);

    @Autowired
    private ThirdPartLoginRepository thirdplRepo;


    @Before
    public void before() {
        thirdplRepo.deleteAll();
    }

    @After
    public void after() {
        thirdplRepo.deleteAll();
    }

    @Test
    public void createPerson() {
        ThirdPartLogin thirdpl = new ThirdPartLogin();
        thirdpl.setProvider(Provider.QQ);
        thirdpl.setCreatedAt(Date.from(Instant.now()));
        thirdpl.setOpenId("aaa");
        thirdplRepo.save(thirdpl);

        long num = thirdplRepo.count();
        assertThat(num, is(1L));

        ThirdPartLogin thirdpl1 = thirdplRepo.findByProviderAndOpenId(Provider.QQ, "aaa");
        
        
        assertThat(thirdpl1.getOpenId(), is(thirdpl.getOpenId()));
        
        thirdpl = new ThirdPartLogin();
        thirdpl.setProvider(Provider.QQ);
        thirdpl.setCreatedAt(Date.from(Instant.now()));
        thirdpl.setOpenId("aaa1");
        thirdplRepo.save(thirdpl);

        
        thirdpl = new ThirdPartLogin();
        thirdpl.setProvider(Provider.QQ);
        thirdpl.setCreatedAt(Date.from(Instant.now()));
        thirdpl.setOpenId("aaa2");
        thirdplRepo.save(thirdpl);

    }
}
