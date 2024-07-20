package com.arrays;

public class Matrix {
	public static void main(String args[]) {
		// creating two matrices
		int a[][]= { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };

		// creating another matrix to store the multiplication of two matrices
		int c[][][] = new int[4][4][4]; // 3 rows and 3 columns

		// multiplying and printing multiplication of 2 matrices
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for(int l=0;l<4;l++) {
 
				c[i][j][l]= 0;
				for (int k = 0; k < 3; k++) {
					c[i][j][l]= a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}
	}

}}
