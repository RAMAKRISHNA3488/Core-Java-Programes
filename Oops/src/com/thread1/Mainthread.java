package com.thread1;

public class Mainthread {
	public static void main(String[] args) {
		
		Mythread t=new Mythread();
		t.start();
		synchronized (t) {
			try {
				System.out.println("main Thread is going to wait");
				t.wait();
			} catch (InterruptedException e) {
			}
			
			System.out.println("main thread Notified");
			System.out.println(t.total);
		}
	}

	}
