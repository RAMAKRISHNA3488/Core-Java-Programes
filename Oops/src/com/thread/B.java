package com.thread;

public class B extends Thread {
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("from thread: j="+j);
		}
		System.out.println("Exit fron B");
	}
	

}
