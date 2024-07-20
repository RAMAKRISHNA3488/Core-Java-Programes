package com.thread1;

public class Account implements Runnable {
	int i = 0;
	String name;

	@Override
	public void run() {
		for (int i = 0; i < 9; i++) {
			System.out.println("this is thread: " + i);
		}
	}

	public static void main(String[] args) {
		Account a = new Account();
		a.run();
	}
}
