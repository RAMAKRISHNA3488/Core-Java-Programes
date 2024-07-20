package com.multithread;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("this is Runnable");
		
	}
public static void main(String[] args) {
	RunnableDemo r=new RunnableDemo();
	Thread t=new Thread(r);
	t.start();
	Thread curretThead =Thread.currentThread();
	System.out.println("Thread name:"+curretThead.getName());
}
}
