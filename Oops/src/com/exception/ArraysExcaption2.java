package com.exception;

public class ArraysExcaption2 {

	public static void main(String[] args) {
    int ar[]= {1,2,3,4,5};
    try {
   for(int i=1;i<=ar[i];i++)
    System.out.println(ar[i]+" ");
    }catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println(e);
    }
	}

}
