package com.okdevtv.tdd.sbtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmokeTest {
	
	@Autowired
	private GreetingController controller;

	@Test
	void testContext() {
		assertNotNull(controller);
	}

}
