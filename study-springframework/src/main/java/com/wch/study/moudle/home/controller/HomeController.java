package com.wch.study.moudle.home.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
	
	@GetMapping
	public Map<String,String> home(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("test", "junit");
		return map;
	}

}
