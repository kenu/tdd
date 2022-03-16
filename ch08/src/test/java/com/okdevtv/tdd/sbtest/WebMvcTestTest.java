package com.okdevtv.tdd.sbtest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class WebMvcTestTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private GreetingService service;

	@Test
	void shouldReturnDefaultMessage() throws Exception {
		when(service.greet()).thenReturn("Hello, Mock");

		this.mockMvc.perform(get("/greeting"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello, Mock")));
	}

}
