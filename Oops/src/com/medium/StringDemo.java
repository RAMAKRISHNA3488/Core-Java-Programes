package com.medium;

public class StringDemo {
	public static void main(String[] args) {
		// String literal used to create string
		String name1 = "Rama";
		String name2 = "Rama";
		// String new keyword used to create string
		String name3 = new String("Krishna");
		String name4 = "Krishna";

		String name5 = name2.intern();
		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		System.out.println(name3 == name4);
		System.out.println(name4 == name1);
		System.out.println(name5 == name2);

	}

}
