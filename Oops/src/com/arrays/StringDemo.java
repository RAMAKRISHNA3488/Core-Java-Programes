package com.arrays;

public class StringDemo {
	public static void main(String[] args) {
		String newLine = System.getProperty("Line Separator");
		// System.out.println(newLine);

		String s = stringConcatenation(newLine);

		// System.out.println(stringConcatenation(newLine));
		//System.out.println(s);
		System.out.println(JoinString(newLine));

	}

	public static String stringConcatenation(String newLine) {
		return ("get busy living.".concat(newLine).concat("or").concat("get busy dying").concat(newLine).toString());
	}

	public static String JoinString(String newLine) {
		return String.join(newLine, "get busy living", "or", "get busy dying");

	}

}
