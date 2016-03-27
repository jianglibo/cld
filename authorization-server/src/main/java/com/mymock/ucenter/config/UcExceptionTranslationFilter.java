package com.mymock.ucenter.config;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

public class UcExceptionTranslationFilter extends ExceptionTranslationFilter {
	
	public UcExceptionTranslationFilter() {
		super(new LoginUrlAuthenticationEntryPoint("/login"));
	}

	public UcExceptionTranslationFilter(AuthenticationEntryPoint authenticationEntryPoint) {
		super(authenticationEntryPoint);
	}

}
