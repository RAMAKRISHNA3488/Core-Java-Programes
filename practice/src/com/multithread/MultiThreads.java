package com.multithread;



public class MultiThreads extends Thread {

	public static void main(String[] args)  {
		MultiThreads mt=  new MultiThreads();
		mt.start();
		for(int i=0;i<=100;i++) {
			System.out.print("I: "+i+"\t");
		}
	}

	public  void run() {
		for(int j=0;j<=100;j++) {
		System.out.print("J: "+j+"\t");
			}
	}
	
}
