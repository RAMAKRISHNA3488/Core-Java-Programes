package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
	    	  int data=50/0;
	      }catch( ArithmeticException  q) {
	    	  System.out.println(q);
	      }
		System.out.println("rest of the code.....");
	}}


