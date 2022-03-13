package com.okdevtv.tdd.ch04;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

public class AssertTest {
	@Test
	public void testAssertEquals() {
		assertEquals("Hello World", new HelloWorld().getMessage());
	}

	@Test
	public void testAssertNotEquals() {
		assertNotEquals("Hello World!", new HelloWorld().getMessage());
	}

	@Test
	public void testAssertTrue() {
		assertTrue(new HelloWorld().getMessage().startsWith("Hello"));
	}

	@Test
	public void testAssertFalse() {
		assertFalse(new HelloWorld().getMessage().startsWith("Hello!"));
	}

	@Test
	public void testAssertNull() {
		assertNull(null);
	}

	@Test
	public void testAssertNotNull() {
		assertNotNull(new HelloWorld().getMessage());
	}

	@Test
	public void testAssertSame() {
		assertSame(new HelloWorld().getMessage(), new HelloWorld().getMessage());
	}

	@Test
	public void testAssertNotSame() {
		assertNotSame(new HelloWorld(), new HelloWorld());
	}

	@Test
	public void testAssertArrayEquals() {
		assertArrayEquals(new HelloWorld().getMessage().toCharArray(), new HelloWorld().getMessage().toCharArray());
	}

	@Ignore
	@Test
	public void testFail() {
		fail("Not yet implemented");
	}

	@Test
	public void testAssertThrows() {
		HelloWorld helloWorld = new HelloWorld();
		assertThrows(IllegalArgumentException.class, () -> helloWorld.getNumber("a"));
		assertThrows(NumberFormatException.class, () -> helloWorld.getNumber("a"));
	}
}
