package com.tech.wcserv.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

/**
 * 
 * This class provides a hook to allow logging of login success messages to backend
 * Password expiry can also be handled here.
 * 
 * 
 * @author hpadmin
 *
 */
public class AuthenticationSuccessHandlerImpl extends SimpleUrlAuthenticationSuccessHandler {
	
	public AuthenticationSuccessHandlerImpl() {
	}
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		handle(request, response, authentication);
		clearAuthenticationAttributes(request);
	}
	
}
