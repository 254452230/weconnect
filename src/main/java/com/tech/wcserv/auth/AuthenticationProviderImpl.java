package com.tech.wcserv.auth;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.tech.wcserv.service.AuthenticateService;
import com.tech.wcserv.vo.AuthResultVO;


@Component("authenticationProvider")
public class AuthenticationProviderImpl implements AuthenticationProvider {
	
	@Autowired
	private AuthenticateService authenticateService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		final String userName = authentication.getPrincipal().toString();
        final String password = authentication.getCredentials().toString();
        
		if (StringUtils.isEmpty(userName)) {
			throw new BadCredentialsException("User Name is empty.");
		} else if (StringUtils.isEmpty(password)) {
			throw new BadCredentialsException("Password is empty.");
		}
		
		final AuthResultVO authResultVO = authenticateService.checkAuth(userName, password);
		
		switch (authResultVO.getAuthResultCode()) {
			case AUTH_FAIL_ACCT_LOCKED:
				throw new LockedException("The account has been locked. Please contact xxx");
			case AUTH_FAIL_NOT_FOUND:
				throw new UsernameNotFoundException("The username does not exist");
			case AUTH_FAIL_PASSWORD_INCORRECT:
				throw new BadCredentialsException("The password is incorrect.");
			case AUTH_FAIL_ACCT_SUSPENDED:
				throw new DisabledException("The account has been suspended.");
			case AUTH_SUCCESS:
				
				final List<GrantedAuthority> authorities = Collections.unmodifiableList(authResultVO.getGrantedAuthorities().stream()
						.map(authStr -> new GrantedAuthorityImpl(authStr))
						.collect(Collectors.toList()));
				
				return new UsernamePasswordAuthenticationToken(authResultVO, password, authorities);
			default:{
				throw new AuthenticationServiceException("There was a problem logging you in. Please try again later.");
			}
		}
	
	}
	
	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
