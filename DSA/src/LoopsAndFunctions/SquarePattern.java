package LoopsAndFunctions;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();

		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
