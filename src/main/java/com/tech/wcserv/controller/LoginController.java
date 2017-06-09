package com.tech.wcserv.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tech.wcserv.common.UserUtils;
import com.tech.wcserv.vo.LoginVO;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("loginVO")LoginVO loginVO) {
		
		final ModelAndView mv = new ModelAndView();
		
		if(UserUtils.isLoggedIn()) {
			mv.setViewName("internal/home");
			
		}else{
			mv.setViewName("external/login");
		}
		
		return mv;
	}
	
}
