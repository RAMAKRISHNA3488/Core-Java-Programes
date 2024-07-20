package com.medium;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("K");
		System.out.println(sb);
		sb.append(" Rama");
		System.out.println(sb);
		sb.insert("Rama".length(), " Krishna");
		System.out.println(sb);
		// StringBuffer as same to produced the output and same program

	}

}
