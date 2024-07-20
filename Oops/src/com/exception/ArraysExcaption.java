package com.exception;

public class ArraysExcaption {

	public static void main(String[] args) {
    int a[]=new int[40];
    try {
    a[10]=50;
    System.out.println(a[100]);
    }catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println(e);
    }
	}

}
