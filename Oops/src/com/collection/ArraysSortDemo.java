package com.collection;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {
		char a[] = { 7, 10, 90, 100, 2, 57 };
		System.out.println("Befor Sort");
		for (int Element : a) {
			System.out.println(Element);
		}

		Arrays.sort(a);
		System.out.println("After Sort");
		for (int Element : a) {
			System.out.println(Element);

		}

		String[] s = { "V", "A", "Z", "P" };

		Arrays.sort(s);
		System.out.println("String Befor");
		for (String string : s) {
			System.out.print(string);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(s,"Z"));


	}
}
