package com.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThread extends Thread {

	public static void main(String[] args) {
		for (int k = 1; k <= 10; k++) {

			ExecutorService es = Executors.newFixedThreadPool(k);

			Thread t = new Thread();
			t.start();
		}
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("I:" + i);
		}
	}
}