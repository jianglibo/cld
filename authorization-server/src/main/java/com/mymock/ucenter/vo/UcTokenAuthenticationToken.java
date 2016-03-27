package com.mymock.ucenter.vo;

import org.springframework.security.authentication.AbstractAuthenticationToken;

public class UcTokenAuthenticationToken extends AbstractAuthenticationToken {
    
    private PersonVo person;

    public UcTokenAuthenticationToken(PersonVo person) {
        super(person.getAuthorities());
        this.person = person;
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public PersonVo getPrincipal() {
        return person;
    }

}
