package com.Java8;

public class MethodReferencing {

	public static void Method1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child THread");
		}
	}

	public static void main(String[] args) {
		Runnable r = MethodReferencing::Method1;
		Thread t = new Thread(r);
		t.start();

		for (int j = 0; j < 10; j++) {
			
		System.out.println("Main thread");
		}
	}

}
