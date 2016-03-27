package com.mymock.ucenter.controller;

import java.util.Set;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.common.collect.Sets;

@Controller
public class TplGetterController {

    
    private AuthenticationTrustResolver trustResolver = new AuthenticationTrustResolverImpl();
    
	public static final Set<String> allowed = Sets.newHashSet("mmm", "register" ,"retrievePassword" , "userInstall");
	
	@RequestMapping(value = "/thtpl", method = RequestMethod.GET)
	public String getTpl(@RequestParam("tpl") String tplname) {
		if (!allowed.contains(tplname)) {
			throw new AccessDeniedException("tpl not exists");
		}
		
		if ("userInstall".equals(tplname) && trustResolver.isAnonymous(SecurityContextHolder.getContext().getAuthentication())) {
		    throw new AccessDeniedException("only for logined user.");
		}
		
		return tplname;
	}
}

