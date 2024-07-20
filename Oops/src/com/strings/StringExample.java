package com.strings;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "ram";

		char ch[] = { 'r', 'a', 'm', 'a' };

		String s2 = new String(ch);
		String s3 = new String("ram");
		System.out.println(s1.hashCode());
		System.out.println(s2);
		System.out.println(s3.hashCode());
		
		

	}

}
