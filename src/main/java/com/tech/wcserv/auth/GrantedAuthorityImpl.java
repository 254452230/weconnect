package com.tech.wcserv.auth;

import org.springframework.security.core.GrantedAuthority;

public class GrantedAuthorityImpl implements GrantedAuthority {

	private static final long serialVersionUID = 4927596439639835856L;
	private final String authority;
	
	public GrantedAuthorityImpl(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return authority;
	}

}
