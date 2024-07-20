package com.thread.threads;

public class A  extends Thread{
	
	public void run() {
		long start=System.currentTimeMillis();
		for(int i =0;i<=5;i++) {
			if (i==3) 
				
			System.out.println("from thread A: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exit Thread A");
		long end= System.currentTimeMillis();
				System.out.println("The total time is "+(end-start)/1000 + " Seounds" );
				
	}

}
