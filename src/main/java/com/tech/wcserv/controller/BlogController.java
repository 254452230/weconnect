package com.tech.wcserv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.wcserv.service.BlogService;
import com.tech.wcserv.vo.BlogVO;

@Controller
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView blog(@RequestParam("blogType")String blogType) {
		
		final ModelAndView mv = new ModelAndView();
		List<BlogVO> blogVOList = blogService.selectByType(blogType);
		
		mv.addObject("blogVOList", blogVOList);
		
		mv.setViewName("external/blog");
		return mv;
	}
}
