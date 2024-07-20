package com.medium;

import java.util.Arrays;
import java.util.List;

public class JavaHacks_20 {

	public static void main(String[] args) {
		// converting an array to list using Array.aslist()
		String[] arr = { "a", "b", "c" };
		List<String> list = Arrays.asList(arr);
		System.out.println(list);

		// Swapping two Variables without using temporary variables
		int a = 5;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

		// Reversing a string using StringBuilder
		String srt = "hello";
		String srt1 = new StringBuffer(srt).reverse().toString();
		System.out.println(srt1);

	}

}
