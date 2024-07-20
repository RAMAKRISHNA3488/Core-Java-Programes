package com.thread;

public class SleepMethodDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		SleepMethodDemo sm=new SleepMethodDemo();
		sm.start();
		for(int a=0;a<=10;a++) {
    	  System.out.print(+a+"R/T");
    	  Thread.sleep(2000);
      }
	}
       public void run() {
    	   for(int b=0;b<=10;b++) {
    		   System.out.print(+b+"R/T");
 
    	   try {
    		   Thread.sleep(2000);
    	   }catch(InterruptedException r) {
    		   System.out.print("child is excist");
    	   }
    	   }
       }
}
