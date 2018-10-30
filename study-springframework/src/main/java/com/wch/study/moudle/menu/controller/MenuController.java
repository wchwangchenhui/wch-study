package com.wch.study.moudle.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wch.study.moudle.menu.service.MenuServcie;

@RestController("menu")
public class MenuController {
	@Autowired
	private MenuServcie menuServcie;
	
	@GetMapping
	public Integer findMenuCount() {
		return menuServcie.selectMenuCount();
	}
}
