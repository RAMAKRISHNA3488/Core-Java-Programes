package com.Patterns;

public class Patterns {

	public static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();

		}
	}

	public static void pattern5(int n) {
		for (int row = 0; row <= 2 * n; row++) {
			int totalcolinrow = row > n ? 2 * n - row : row;
			for (int col = 0; col <= totalcolinrow; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void pattern6(int n) {
		for (int row = 0; row <= 2 * n; row++) {
			int totalcolinrow = row > n ? 2 * n - row : row;
			int noOfSpace = n - totalcolinrow;
			for (int k = 0; k < noOfSpace; k++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= totalcolinrow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 0; space < n - row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}

			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int c = row > n ? 2 * n - row : row;

			for (int space = 0; space < n - c; space++) {
				System.out.print("  ");
			}
			for (int col = c; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= c; col++) {
				System.out.print(col + " ");
			}

			System.out.println();
		}
	}

	public static void pattern9(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == 1 || col == 1 || row == n || col == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		pattern9(6);
		pattern8(5);
		pattern7(5);

	}

}
