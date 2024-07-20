package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "I am Ram";

		System.out.println("Length of string is:" + s.length());
		System.out.println("Index:" + s.indexOf('a'));
		System.out.println("charAt:" + s.charAt(6));
		System.out.println("Substring with beginning Index:" + s.substring(4));
		System.out.println("substring with begin and end:" + s.substring(0, 8));

		String[] result = s.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("replace" + s.replace('a', 'm'));
		System.out.println("ToUpperCase:" + s.toUpperCase());
		System.out.println("Tolowercase:" + s.toLowerCase());
	}

}
