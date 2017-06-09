package com.tech.wcserv.system;


import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.tech.wcserv.common.CommonConstants;

@Component
public class ContextStartupListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private ServletContext servletContext;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		servletContext.setAttribute(CommonConstants.CONTEXT_PATH, servletContext.getContextPath());
		
	}

}
