package com.medium;

public class PyramidPattern {
	public static void main(String[] args) {
		int num=5;
		for(int row=0;row<num;row++) {
			for(int col=0;col<num-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
