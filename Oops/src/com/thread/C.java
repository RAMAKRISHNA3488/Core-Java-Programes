package com.thread;

public class C extends Thread {
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("from thread: k=" + k);
		}
		System.out.println("Exit fron B");
	}

}
