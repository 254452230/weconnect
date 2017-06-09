package com.tech.wcserv.vo;

import java.io.Serializable;
import java.util.List;

import com.tech.wcserv.common.enums.AuthResultCode;

public class AuthResultVO implements Serializable{

	private static final long serialVersionUID = 2784884307724815313L;
	
	private String fullName;
	private String userName;
	private AuthResultCode authResultCode;
	private List<String> grantedAuthorities;
	
	
	public List<String> getGrantedAuthorities() {
		return grantedAuthorities;
	}
	public void setGrantedAuthorities(List<String> grantedAuthorities) {
		this.grantedAuthorities = grantedAuthorities;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public AuthResultCode getAuthResultCode() {
		return authResultCode;
	}
	public void setAuthResultCode(AuthResultCode authResultCode) {
		this.authResultCode = authResultCode;
	}
	
}
