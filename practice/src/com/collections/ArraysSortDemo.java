package com.collections;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {
		char []a= {1,2,20,55,60,1000,99,1};
		System.out.println(" Sorting");
		
		for (int Element: a) {
			System.out.println(Element);
		}
		
		Arrays.sort(a);
		System.out.println("After Sorting ");
		for (int Elements : a) {
			
			System.out.println(Elements);
			
		}
		String[] s = { "V", "A", "Z", "P" };
		Arrays.sort(s);
		for (String string : s) {
			System.out.println(string);
		}
		System.out.println(Arrays.binarySearch(s,"P"));

	}

}
