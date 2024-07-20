package com.exception;

public class StackOverFlow {
	
	static void method1() {
		System.out.println("method1");
		method2();
	}
	static void method2() {
		System.out.println("method2");
		method1();
	}

	public static void main(String[] args) {
		try {
		method1();
		}catch(StackOverflowError e) {
			System.out.println(e);
		}
	}

}
