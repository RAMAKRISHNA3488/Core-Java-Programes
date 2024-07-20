package com.multithread;

public class Identity extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Identity i=new Identity();
		i.start();
		
		
   Thread currentThread= Thread.currentThread();
   System.out.println("Thread name is: "+currentThread.getName());
   i.print();
   
	}
	
	public void run() {
		Thread currentThread= Thread.currentThread();
		currentThread.setName("Run Thread");
		System.out.println("Thread name is: "+currentThread.getName());
	}
	public void print() {
		Thread currentThread= Thread.currentThread();
		currentThread.setName("print");
		   System.out.println("Thread name is: "+currentThread.getName());
	}
	
}
