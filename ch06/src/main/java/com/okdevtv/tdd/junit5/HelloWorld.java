package com.okdevtv.tdd.junit5;

public class HelloWorld {

	public String getMessage() {
		return getMessage("World");
	}

	public String getMessage(String string) {
		if (string == null) {
			string = "World";
		}
		return "Hello " + string;
	}

}
