package com.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		char[] a=new char[5];
		a[0]='a';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		a[4]='e';
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(a[i]);
		}
	}

}
