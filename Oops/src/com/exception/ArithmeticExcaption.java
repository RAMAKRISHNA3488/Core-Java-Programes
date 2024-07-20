package com.exception;

public class ArithmeticExcaption {

	public static void main(String[] args) {
		
		try {
		int a=10/3;
		System.out.println(a);
		}catch(ArithmeticException e) {
		System.out.println(e );
		}
	}

}
