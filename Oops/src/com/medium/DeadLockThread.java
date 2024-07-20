package com.medium;

public class DeadLockThread {
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread 1 acquired0 lock 1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("Thraed 1 acquired0 lock 2");
				}

			}

		});
		Thread t2 = new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Thread 2 acquired lock 2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("Thraed 2 acquired lock 1");
				}

			}

		});
		t1.start();
		t2.start();

	}
}
