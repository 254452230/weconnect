package com.tech.wcserv.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.wcserv.common.CommonConstants;
import com.tech.wcserv.common.enums.AuthResultCode;
import com.tech.wcserv.dao.WorkerInfoDAO;
import com.tech.wcserv.service.AuthenticateService;
import com.tech.wcserv.vo.AuthResultVO;
import com.tech.wcserv.vo.WorkerInfoVO;

@Service
public class AuthenticateServiceImpl implements AuthenticateService{

	@Autowired
	private WorkerInfoDAO workerInfoDAO;
	
	public WorkerInfoVO selectByUserName(String userName){
		return workerInfoDAO.selectByUserName(userName);
	};
	
	public AuthResultVO checkAuth(String userName, String password){
		final AuthResultVO authResultVO = new AuthResultVO();
		WorkerInfoVO workerInfoVO = workerInfoDAO.selectByUserName(userName);
		
		if (workerInfoVO == null) {
			authResultVO.setAuthResultCode(AuthResultCode.AUTH_FAIL_NOT_FOUND);
			
		} else if (StringUtils.equals(workerInfoVO.getStatus(), CommonConstants.ACCT_ACTIVE)){
			
			if (StringUtils.equals(workerInfoVO.getPassword(), password)) {
				authResultVO.setAuthResultCode(AuthResultCode.AUTH_SUCCESS);
				authResultVO.setFullName(workerInfoVO.getFullName());
				authResultVO.setUserName(workerInfoVO.getUserName());
				
				final String authStr = workerInfoVO.getRole();
				final List<String> grantedAuthorities = Arrays.asList(authStr.split("\\s*,\\s*"));
				authResultVO.setGrantedAuthorities(grantedAuthorities);
				
			}else{
				authResultVO.setAuthResultCode(AuthResultCode.AUTH_FAIL_PASSWORD_INCORRECT);
				
				String status = null;
				if (workerInfoVO.getLoginFailCount() + 1 >= CommonConstants.LOCKED_THRESHOLD) {
					status = CommonConstants.ACCT_LOCKED;
				}
				workerInfoDAO.updateLoginFailCount(workerInfoVO.getUserName(), workerInfoVO.getLoginFailCount() + 1, status);
			}
			
		} else if (StringUtils.equals(workerInfoVO.getStatus(), CommonConstants.ACCT_LOCKED)){
			authResultVO.setAuthResultCode(AuthResultCode.AUTH_FAIL_ACCT_LOCKED);
			
		} else if (StringUtils.equals(workerInfoVO.getStatus(), CommonConstants.ACCT_SUSPEND)){
			authResultVO.setAuthResultCode(AuthResultCode.AUTH_FAIL_ACCT_SUSPENDED);
			
		}
		
		return authResultVO;
	}
	
}
