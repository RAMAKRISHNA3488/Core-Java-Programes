package com.thread;

public class MyThreadSolution {

	public static void main(String[] args) {
		MyThread thread1=new MyThread("Thread1: ");
		MyThread thread2=new MyThread("Thread2: ");
		thread1.start();
		thread2.start();
		boolean thread1IsAlive=true;
		boolean thread2IsAlive=true;
		do {
			if(thread1IsAlive&&thread1.isAlive()) {
				thread1IsAlive=false;
				System.out.println("Thraed 1 is dead.");
			}
			if(thread2IsAlive&&thread2.isAlive()) {
				thread2IsAlive=false;
				System.out.println("Thread 2 is dead.");
			}
			
		}while(thread1IsAlive||thread2IsAlive);

	}

}
