package com.thread;

public class MultiThreaded extends Thread {

	public static void main(String[] args)  {
		MultiThreaded sm=new MultiThreaded();
		sm.start();
		for(int a=0;a<=20;a++) {
    	  System.out.print("a: "+a+"\t");
      }
	}
       public void run() {
    	   for(int b=0;b<=20;b++) {
    		   System.out.print("b: "+b+"\t");
    		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		   
    	   }
       }
}
