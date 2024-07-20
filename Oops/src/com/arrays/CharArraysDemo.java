package com.arrays;

public class CharArraysDemo {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d'};
		try {
		int b=a[0]+a[a.length-1];
		System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
