package com.okdevtv.tdd.junit4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	
	private HelloWorld hello;
	
	@Before
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
	
	@After
	public void tearDown() {
		System.out.println("...");
	}
}
