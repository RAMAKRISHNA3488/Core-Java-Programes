package com.thread;

public class DaemonDemoTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().getThreadGroup());
		MyDaemonThread myDaemonThread = new MyDaemonThread();
		System.out.println(myDaemonThread.isDaemon());
		myDaemonThread.start();
	}

}
