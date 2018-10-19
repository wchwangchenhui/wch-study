package com.wch.study.moudle.login.service.impl;

import org.springframework.stereotype.Service;

import com.wch.study.moudle.login.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean login(String username, String password) {
		if("wch".equals(username) && "123456".equals(password)) {
			return true;
		}
		return false;
	}

}
