package com.arrays;

public class FiveWithzero {

	public static void main(String[] args) {
		int a[]= {3,4,5,3,5,7,1,5,2,5,1};
		for(int i=0;i<a.length;i++) {
			if(a[i]==5) {
				a[i]=0;
				
			}
		}
     for (int i : a) {
    	 System.out.print(i);
		
	}
	}

}
