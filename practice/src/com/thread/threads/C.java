package com.thread.threads;

public class C  extends Thread{
	
	public void run() {
		long start=System.currentTimeMillis();
		for(int k =0;k<=5;k++) {
			System.out.println("from thread C: "+k);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exit Thread C");
		long end= System.currentTimeMillis();
		System.out.println("The total time is "+(end-start)/1000 + " Seounds" );
	}

}
