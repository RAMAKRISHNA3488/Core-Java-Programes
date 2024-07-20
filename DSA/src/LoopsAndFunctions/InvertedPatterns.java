package LoopsAndFunctions;

import java.util.Scanner;

public class InvertedPatterns {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();

		for (int i = num; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
