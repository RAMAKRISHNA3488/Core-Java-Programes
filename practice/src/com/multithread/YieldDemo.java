package com.multithread;

public class YieldDemo {

	public static void main(String[] args) {
		YieldMyThread y=new YieldMyThread();
		y.start();
		for(int k=1;k<=10;k++) {
			System.out.println("main Thread");
		}

	}

}
