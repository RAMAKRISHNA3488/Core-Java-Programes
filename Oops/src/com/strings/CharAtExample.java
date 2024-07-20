package com.strings;

public class CharAtExample {

	public static void main(String[] args) {
		String  s1 = "i am ram from my village";
		int s1length = s1.length();
		System.out.println("the length of the s1 is: " + s1length);//it's finding length of the string
		System.out.println(s1.charAt(6));
		System.out.println(s1.charAt(s1length-1));

	}

}
