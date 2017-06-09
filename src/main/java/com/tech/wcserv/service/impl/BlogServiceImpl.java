package com.tech.wcserv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.wcserv.dao.BlogDAO;
import com.tech.wcserv.service.BlogService;
import com.tech.wcserv.vo.BlogVO;

@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogDAO blogDAO;
	
	@Override
	public List<BlogVO> selectByType(String blogType) {
		return blogDAO.selectByType(blogType);
	}

}
