package com.tech.wcserv.common;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

	private UserUtils() {
	
	}
	
	public static boolean isLoggedIn() {
		
		final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		final boolean authenticated;
		
		if (auth instanceof AnonymousAuthenticationToken) {
			authenticated = false;
		} else {
			authenticated = true;
		}
		
		return authenticated;
	}
}
