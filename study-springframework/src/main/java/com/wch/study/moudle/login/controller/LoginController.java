package com.wch.study.moudle.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.wch.study.moudle.login.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = {"/login"})
	public ModelAndView login(String username, String password) {
		WebApplicationContext applicationContext = ContextLoader.getCurrentWebApplicationContext();
		
		
		String viewName = "login/login";	
		if(loginService.login(username, password)) {
			viewName = "home/home";
		}
		return new ModelAndView("redirect:" + viewName);
	}
}
