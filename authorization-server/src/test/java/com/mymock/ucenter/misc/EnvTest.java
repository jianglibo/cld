package com.mymock.ucenter.misc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.mymock.ucenter.ItBase;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class EnvTest extends ItBase {
    
    @Autowired
    private Environment env;
    
    @Test
    public void tpl() {
        String prefix = env.getProperty("spring.view.prefix");
        String suffix = env.getProperty("spring.view.suffix");
        assertThat(prefix, nullValue());
        assertThat(suffix, nullValue());
    }

}
