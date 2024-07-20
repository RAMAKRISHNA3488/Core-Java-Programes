package com.exception;

public class ArrayIndexOutOfBoundDemo {

	public static void main(String[] args) {
		try {
		int a[]=new int [30];
		System.out.println(a[100]);
		System.out.println(a[a.length-1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
