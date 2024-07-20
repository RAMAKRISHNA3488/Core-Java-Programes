package com.inheritance.THIS;

public class JDC1 {
	
	JDC1(){
		this(" ");          //this line is default
		System.out.println("this is JDC1 line....");
	}
	JDC1(String a){
		System.out.println("this is line two");  //this is parameterized constructor
		
	}
	public static void main(String[] args) {
		System.out.println("this is main ");
		JDC1 j=new JDC1();
	}

}
