package com.performance.centre.test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.performance.centre.controller.RandomMessageController;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/RandomMessageControllerTest-context.xml")
@WebAppConfiguration
public class RandomMessageControllerTest {
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {

		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void getQuote() throws Exception {
		mockMvc.perform(get("/randomQuote")).andExpect(status().isOk())
				.andExpect(view().name(RandomMessageController.RANDOM_QUOTE))
				.andExpect(forwardedUrl("/WEB-INF/randomQuote.jsp"));
	}
}
