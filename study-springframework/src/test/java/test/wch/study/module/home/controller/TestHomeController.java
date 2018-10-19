package test.wch.study.module.home.controller;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.wch.study.moudle.home.controller.HomeController;

import test.wch.study.module.JunitTestBase;

public class TestHomeController extends JunitTestBase{
	
	
	@Test
	public void loginTest() {
		System.out.println("第一个测试方法*******");
		HomeController controller = wac.getBean(HomeController.class);
		Map<String,String> map = controller.home();
		Assert.assertEquals("junit", map.get("test"));
	}
}
