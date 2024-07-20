package com.strings;

public class StringDemo {


	public static String stringConcatenation(String newLine) {
		return ("get busy living".concat(newLine).concat("or").toString());
	}

	public static void main(String[] args) {
		String newLine = System.getProperty("Line.separator.");

		System.out.println(StringDemo.stringConcatenation(newLine));

	}

}
