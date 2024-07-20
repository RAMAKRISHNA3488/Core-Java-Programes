package com.Patterns;

public class TrianglePatterns {

	public static void TRIANGLE(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 0; space < n - row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print("* ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void TRIANGLEDOWN(int n) {
		for (int row = 1; row <= n * 2; row++) {
			int c = row > n ? 2 * row - n : row;
			for (int space = 0; space < n - c; space++) {
				System.out.print("  ");
			}
			for (int col = c; col >= 1; col--) {
				System.out.print("* ");
			}
			for (int col = 2; col <= c; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TRIANGLE(5);
//	TRIANGLEDOWN(5);
	}

}
