package com.Java8;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
			System.out.println("Child Thread"+i);
			
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void display() {
		for(int i=0;i<10;i++) {
			try {
			System.out.println("Inside the child Thead"+i);
			Thread.sleep(1000);
			}catch (InterruptedException e) {
			}
		}
	}

}
