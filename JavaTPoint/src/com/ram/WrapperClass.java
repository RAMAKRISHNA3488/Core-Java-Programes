package com.ram;

public class WrapperClass {
	public static void main(String[] args) {
		int a=10;
		
		Integer i=Integer.valueOf(a);
		System.out.println(i);
		System.out.println(i.compareTo(a));
	}

}
