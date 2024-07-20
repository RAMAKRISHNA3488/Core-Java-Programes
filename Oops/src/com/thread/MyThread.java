package com.thread;

public class MyThread extends Thread{
	static String [] message= {"Java","is","not","acromati","and","invigorating"};
	public MyThread(String id) {
		super(id);
	}
	public void run() {
		String name=getName();
		for(int i=0;i<message.length;++i) {
			randomWait();
			System.out.println(name+message[i]);
		}
	}
	 void randomWait() {

		 try {
			sleep((long) (3000*Math.random()));
		} catch (InterruptedException e) {
		System.out.println("Interrupted!");
		}
	}

}
