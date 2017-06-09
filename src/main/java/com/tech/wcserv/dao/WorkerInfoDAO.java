package com.tech.wcserv.dao;

import org.apache.ibatis.annotations.Param;

import com.tech.wcserv.vo.WorkerInfoVO;

public interface WorkerInfoDAO {

	public WorkerInfoVO selectByUserName(@Param("userName")String userName);
	
	public void updateLoginFailCount(@Param("userName")String userName, @Param("loginFailCount")Integer loginFailCount, @Param("status")String status);
}
