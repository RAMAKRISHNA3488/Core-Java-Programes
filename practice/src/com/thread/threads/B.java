package com.thread.threads;

public class B  extends Thread{
	
	public void run() {
		long start=System.currentTimeMillis();
		for(int j =0;j<=5;j++) {
			System.out.println("from thread B: "+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exit Thread B");
		long end= System.currentTimeMillis();
		System.out.println("The total time is "+(end-start)/1000 + " Seounds" );
	}

}
