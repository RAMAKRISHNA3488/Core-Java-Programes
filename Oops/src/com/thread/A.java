package com.thread;

public class A extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(" from thread: i="+i);
		}
		System.out.println("Exit fron A");
	}
	

}
