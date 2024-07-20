package com.thread;

import java.io.IOException;

public class TestPriorityABC {

	public static void main(String[] args) {
		A ThreadA=new A();
		B threadB=new B();
		C threadC=new C();
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(ThreadA.getPriority()+1);
		ThreadA.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Start Thread A");
		ThreadA.start();
		System.out.println("Start Thread B");
		threadB.start();
		System.out.println("Start Thread C");
		threadC.start();
		
		System.out.println("End of main thread");
		
		

	}

}
