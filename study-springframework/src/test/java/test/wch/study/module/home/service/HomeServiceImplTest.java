package test.wch.study.module.home.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wch.study.moudle.home.service.HomeService;

import test.wch.study.module.JunitTestBase;

public class HomeServiceImplTest extends JunitTestBase{
	@Autowired
	private HomeService homeService;
	
	@Test
	public void myfirstTest() {
		String result = homeService.myfirst();
		Assert.assertEquals("hello world", result);
	}
}
