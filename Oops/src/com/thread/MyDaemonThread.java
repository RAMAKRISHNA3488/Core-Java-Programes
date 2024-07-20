package com.thread;

public class MyDaemonThread extends Thread {
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			System.out.print("\uD83E\uDD84");
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState()+"\uD83E\uDD84");
		System.out.println(Thread.currentThread().MAX_PRIORITY);
		System.out.println(Thread.currentThread().MIN_PRIORITY);
		System.out.println(Thread.currentThread().NORM_PRIORITY);
		System.out.println(Thread.currentThread().getId());
		System.out.println("\uD83E\uDD84");
	
	}
}
