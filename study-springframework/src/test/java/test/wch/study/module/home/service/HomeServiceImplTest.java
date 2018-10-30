package test.wch.study.module.home.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wch.study.moudle.home.service.HomeService;
import com.wch.study.moudle.home.service.impl.HomeServiceImpl;

import test.wch.study.module.JunitTestBase;

public class HomeServiceImplTest extends JunitTestBase{
	@Autowired
	private HomeService homeService;
	
	@Test
	public void myfirstTest() {
		String result = homeService.myfirst();
		Assert.assertEquals("hello world", result);
	}
	
	@Test
	public void getHomeServiceInstance() {
		HomeServiceImpl impl =  this.wac.getBean(HomeServiceImpl.class);
		Assert.assertEquals(homeService, impl);
	}
}
