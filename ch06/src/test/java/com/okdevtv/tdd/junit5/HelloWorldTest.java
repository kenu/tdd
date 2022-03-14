package com.okdevtv.tdd.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	
	private HelloWorld hello;
	
	@BeforeEach
	public void setUp() {
		hello = new HelloWorld();
	}

	@Test
	public void test() {
		String message = hello.getMessage();
		assertEquals("Hello World", message);
	}

	@Test
	public void testGetMessage() {
		String message = hello.getMessage("kenu");
		assertEquals("Hello kenu", message);
	}
	
	@Test
	public void testGetMessageNull() {
		String message = hello.getMessage(null);
		assertEquals("Hello World", message);
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("...");
	}
}
