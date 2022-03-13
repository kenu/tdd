package com.okdevtv.tdd.ch02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void testGetMessage() {
		HelloWorld helloWorld = new HelloWorld();
		String message = helloWorld.getMessage();
		assertEquals("Hello World", message);
	}
}
