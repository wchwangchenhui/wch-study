package test.wch.study.module.menu.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wch.study.moudle.menu.service.MenuServcie;

import test.wch.study.module.JunitTestBase;

public class MenuServiceTest extends JunitTestBase{
	@Autowired
	private MenuServcie menuServcie;
	
	@Test
	public void menuInstanceTest() {
		int count = menuServcie.installMenu("登录","/login/login");
		Assert.assertEquals(1, count);
	}
}
