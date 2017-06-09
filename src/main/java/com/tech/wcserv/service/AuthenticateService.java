package com.tech.wcserv.service;

import com.tech.wcserv.vo.AuthResultVO;
import com.tech.wcserv.vo.WorkerInfoVO;

public interface AuthenticateService {

	public WorkerInfoVO selectByUserName(String userName);
	
	public AuthResultVO checkAuth(String userName, String password);
}
