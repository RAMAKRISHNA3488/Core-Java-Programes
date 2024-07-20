package com.Java8;

public class MyRunnableTest {

	public static void main(String[] args) throws InterruptedException {
		//Runnable r=new MyRunnable();
		//Thread t=new Thread(r);
		//t.start();
		
		
		Runnable r= ()->{
			for(int i=0;i<=10;i++) {
				try {
				System.out.println("Child thread: "+i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		Thread t=new Thread(r);
		t.start();
		
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		
		
		for(int j=0;j<=10;j++) {
			System.out.println("Main Thread: "+j);
			Thread.sleep(1000);
		}
		
		MyRunnable myRunnable=new MyRunnable();
		myRunnable.display();

	}

}
