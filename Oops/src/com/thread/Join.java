package com.thread;

import java.util.Scanner;

public class Join extends Thread {
	static int N, sum = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("sum of frist N numbers");
		System.out.println("Enter Number value");
		Scanner scanner = new Scanner(System.in);
		Join.N = scanner.nextInt();
		Join jn = new Join();
		jn.start();
		try {
			jn.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sum of first " + jn.N + " Numbers is " + jn.sum);
		long end = System.currentTimeMillis();
		System.out.println("the total time is " + (end - start) / 1000 + " Seconds"); // this is current time

	}

	public void run() {
		for (int i = 1; i <= Join.N; i++) {
			Join.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
