package com.Static;

public class Refers {
	
	static int a=10;
	int b=20;
	

	public static void main(String[] args) {
		System.out.println(a);
		Refers r=new Refers();
		System.out.println(r.a);

	}

}
