package com.multithread;

public class Priorty extends Thread{

	public static void main(String[] args) {
     Priorty p=new Priorty();
     p.setPriority(MIN_PRIORITY);
     p.setName("main");
     p.start();
     Priorty p1=new Priorty();
     p1.setPriority(MAX_PRIORITY);
     p1.setName("main1");
     p1.start();
     
     /*for(int i=1;i<=10;i++) {
    	 System.out.println("i: "+i);
     }*/
	}
    public void run() {
    	System.out.println("Tread name: "+Thread.currentThread().getName());

    	 /*for(int k=1;k<=10;k++) {
        	 System.out.println("k: "+k);
         }*/
    }
}
