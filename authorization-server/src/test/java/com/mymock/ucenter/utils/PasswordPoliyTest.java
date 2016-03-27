package com.mymock.ucenter.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.mymock.ucenter.utils.PasswordPolicy;
import com.mymock.ucenter.utils.PasswordPolicy.PasswordViolationMessage;

public class PasswordPoliyTest {

    @Test
    public void tletters() {
        PasswordViolationMessage pvm = PasswordPolicy.validatePassword(" ab");
        
        assertThat(pvm, is(PasswordViolationMessage.PWD_TOO_SHORT));
        
        pvm = PasswordPolicy.validatePassword(" abddddddddddddddddddsssssssssssssssssssssssssssssssssssss");
        assertThat(pvm, is(PasswordViolationMessage.PWD_TOO_LONG));
        
        pvm = PasswordPolicy.validatePassword(" abdddddddddddddddddd");
        assertThat(pvm, is(PasswordViolationMessage.PWD_CONTAIN_ILLEGAL_CHAR));
        
        pvm = PasswordPolicy.validatePassword("abdddddddddddddddddd");
        assertThat(pvm, is(PasswordViolationMessage.YES));

    }
}
