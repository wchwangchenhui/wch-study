package com.wch.study.moudle.menu.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wch.study.moudle.menu.mapper.MenuMapper;
import com.wch.study.moudle.menu.service.MenuServcie;

@Service
public class MenuServiceImpl implements MenuServcie{
	@Resource
	private MenuMapper menuMapper;

	@Override
	public Integer selectMenuCount() {
		return menuMapper.selectMenuCount();
	}

	@Override
	public int installMenu(String name, String url) {
		Date date = new Date();
		
		menuMapper.installMenu(name, url, "wch", date);
		return 1;
	}
	
	

}
