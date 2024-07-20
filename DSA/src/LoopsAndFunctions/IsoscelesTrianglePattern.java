package LoopsAndFunctions;

import java.util.Scanner;

public class IsoscelesTrianglePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
