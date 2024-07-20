package com.thread1;

public class ThreadDemo extends Thread {
	// override the run() method to provide custom implementation

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Thread t1 = new Thread();
		t1.start();
		ThreadDemo t=new ThreadDemo();
		t.run();
		long end=System.currentTimeMillis();
		System.out.println("The total time is: "+(end-start)/1000+" seconds");
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread:"+i);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
