package com.okdevtv.tdd.ch03;

import junit.framework.TestCase;

public class ScannerTest extends TestCase implements Display {
	private Item lastItem;

	public ScannerTest(String name) {
		super(name);
	}

	public void testScan() {
		Scanner scanner = new Scanner(this);
		scanner.scan();
		assertEquals(new Item("Cornflakes").toString(), lastItem.toString());
	}

	@Override
	public void displayItem(Item item) {
		lastItem = item;
	}
}
