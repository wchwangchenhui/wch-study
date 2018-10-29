package test.wch.study.module.home.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import test.wch.study.module.JunitTestBase;

public class HomeControllerTest extends JunitTestBase{
	
	@Test
	public void loginTest() throws Exception {
		System.out.println("第一个测试方法*******");
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post("/home"));
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		int status = mvcResult.getResponse().getStatus();
		System.out.println("result:" + result);
		Assert.assertEquals(200, status);
	}
}
