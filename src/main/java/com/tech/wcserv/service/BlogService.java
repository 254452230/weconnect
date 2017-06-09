package com.tech.wcserv.service;

import java.util.List;

import com.tech.wcserv.vo.BlogVO;

public interface BlogService {
	
	public List<BlogVO> selectByType(String blogType);
}
