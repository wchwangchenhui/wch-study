package com.wch.study.moudle.home.service.impl;

import org.springframework.stereotype.Service;

import com.wch.study.moudle.home.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Override
	public String myfirst() {
		return "hello world";
	}
}
