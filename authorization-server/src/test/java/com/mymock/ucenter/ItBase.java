package com.mymock.ucenter;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.core.env.Environment;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mymock.ucenter.UcApplication;
import com.mymock.ucenter.config.AppMiscConfigUc;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UcApplication.class)
@WebIntegrationTest({"appmisc.in-testing=true", "spring.datasource.url=jdbc:h2:mem:test", TeEnvConstant.ZERO_SERVER_PORT})
public abstract class ItBase extends NfTsBase {
    
    
    @Autowired
    protected AppMiscConfigUc appConfig;
    
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    protected WebApplicationContext context;
    
    @Autowired
    protected Environment env;
    
    public String getRestUri(String withoutBase) {
        String baseUri = env.getProperty("spring.data.rest.base-uri");
        return baseUri + withoutBase;
    }
    
    public void printme(Object o) {
        System.out.println(o);
    }

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
    
    public void assertHasAuthories(Collection<GrantedAuthority> gas, String...roleName) {
        boolean allMatch = Stream.of(roleName).allMatch(rn -> {
            return gas.stream().anyMatch(ga -> rn.equals(ga.getAuthority()));
        });
        
        assertThat("contain all roleNames.", allMatch, is(true));
    }
    
    public void assertHasSameAuthories(Collection<GrantedAuthority> gas, String...roleName) {
        assertThat("length should equal.", gas.size(), is(roleName.length));
        assertHasAuthories(gas, roleName);
    }

}

