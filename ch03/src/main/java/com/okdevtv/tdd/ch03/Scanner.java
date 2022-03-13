package com.okdevtv.tdd.ch03;

public class Scanner {

	private Display display;

	public Scanner(Display display) {
		this.display = display;
	}

	public void scan() {
		display.displayItem(new Item("Cornflakes"));
	}

}
