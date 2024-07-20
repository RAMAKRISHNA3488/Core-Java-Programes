package com.multithread;

public class YieldMyThread extends Thread  {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child Thread");
			Thread.yield();
		}
	}
	

}
