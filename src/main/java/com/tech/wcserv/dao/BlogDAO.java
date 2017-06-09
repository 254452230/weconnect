package com.tech.wcserv.dao;


import java.util.List;

import com.tech.wcserv.vo.BlogVO;

public interface BlogDAO {
	
	public List<BlogVO> selectByType(String blogType);
}
