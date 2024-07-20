package com.arrays;

public class StringReverse {


	public static void main(String[] args) {
		String s="Ramakrishna";
		char []c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}

	}

}
