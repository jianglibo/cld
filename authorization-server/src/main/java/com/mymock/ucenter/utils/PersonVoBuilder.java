package com.mymock.ucenter.utils;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.util.Assert;

import com.google.common.collect.Sets;
import com.mymock.ucenter.vo.PersonVo;

public class PersonVoBuilder {
	
	private String email;
	private String mobile;
	private String name;
	private String password;
	
	private String avatar;
	
	private String displayName;
	
	private String[] authorizes = new String[]{};
	
	public PersonVoBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public PersonVoBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public PersonVoBuilder mobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
	
	public PersonVoBuilder password(String password) {
		this.password = password;
		return this;
	}
	
	public PersonVoBuilder displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}
	
	public PersonVoBuilder avatar(String avatar) {
		this.avatar = avatar;
		return this;
	}
	
	public PersonVoBuilder authorizes(String...authorizes) {
		this.authorizes = authorizes;
		return this;
	}
 
	public PersonVo build() {
		Assert.notNull(password,"password field is required.");
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		
		if (name == null) {
			name = uuid;
		}
		
		if (email == null) {
			email = uuid + "@openscanner.cc";
		}
		
		if (displayName == null) {
			displayName = name;
		}
		
		Collection<GrantedAuthority> gas = Sets.newHashSet();
		
		if (authorizes.length > 0) {
			gas = Stream.of(authorizes).map(a -> a.toUpperCase()).map(a -> a.startsWith("ROLE_") ? a : "ROLE_" + a).map(a -> new SimpleGrantedAuthority(a)).collect(Collectors.toSet());
		}
		return new PersonVo(name, displayName, email, mobile, password, true, true, true, true, avatar, gas);
	}

}

