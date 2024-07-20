package com.strings;

public class StringBufforDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity: " + sb.capacity());
		sb.append("All the powres is with in you. ");
		sb.append("You can do anythind and everything. ");
		sb.append("it's me ");

		System.out.println(sb);
		System.out.println("current capacity " + sb.capacity());

		System.out.println("CharAt " + sb.charAt(15));
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println(sb1.reverse());

		System.out.println(sb1.insert(3, "xyz"));
		System.out.println(sb1.delete(3, 6));

	}

}
