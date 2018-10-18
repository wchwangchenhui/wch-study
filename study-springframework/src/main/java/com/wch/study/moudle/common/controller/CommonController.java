package com.wch.study.moudle.common.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	
	@RequestMapping(value = {"/{module}", "/{module}/"})
	public ModelAndView init(@PathVariable String module) {
		ModelAndView mav = new ModelAndView();
		if (StringUtils.isNotBlank(module)) {
			mav.setViewName(module + "/" + module);
		} else {
			mav.setViewName("home/home");
		}
		return mav;
	}
	
	@RequestMapping(value = {"/{module}/{view}","/{module}/{view}/"})
	public ModelAndView init(@PathVariable String module, @PathVariable String view) {
		ModelAndView mav = new ModelAndView();
		if (StringUtils.isNotBlank(module)) {
			if (StringUtils.isNotBlank(view)) {
				mav.setViewName(module + "/" + view);
			} else {
				mav.setViewName(module + "/" + module);
			}
		} else {
			mav.setViewName("home/home");
		}
		return mav;
	}
}
