package test.wch.study.module.menu.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import test.wch.study.module.JunitTestBase;

public class MenuControllerTest extends JunitTestBase{
	
	@Test
	public void findMenuCountTest() throws Exception {
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/menu"));
		MvcResult mvcResult = resultActions.andReturn();
		String countStr = mvcResult.getResponse().getContentAsString();
		int status = mvcResult.getResponse().getStatus();
		Assert.assertEquals(200, status);
		Assert.assertEquals("1", countStr);
	}
}
