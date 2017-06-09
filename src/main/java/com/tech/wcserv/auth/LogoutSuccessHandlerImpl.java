package com.tech.wcserv.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;


/**
 * 
 * This class provides a hook to allow logging of logout messages to backend and other cleanup
 * tasks, should the need arise.
 * 
 * @author hpadmin
 *
 */
public class LogoutSuccessHandlerImpl extends SimpleUrlLogoutSuccessHandler {
	
	
	@Autowired
	public LogoutSuccessHandlerImpl() {

	}
	
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
	}
	
}
