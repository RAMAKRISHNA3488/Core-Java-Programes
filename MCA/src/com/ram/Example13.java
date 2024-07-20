package com.ram;

import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first integer (between 25 and 75): ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second integer (between 25 and 75): ");
		int num2 = scanner.nextInt();

		if (isValidRange(num1) && isValidRange(num2)) {
			boolean hasCommonDigit = hasCommonDigit(num1, num2);

			System.out.println("Result: " + hasCommonDigit);
		} else {
			System.out.println("Invalid input values. Both values must be between 25 and 75.");
		}
	}

	public static boolean isValidRange(int num) {
		return num >= 25 && num <= 75;
	}

	public static boolean hasCommonDigit(int num1, int num2) {
		String str1 = String.valueOf(num1);
		String str2 = String.valueOf(num2);

		for (char c : str1.toCharArray()) {
			if (str2.contains(String.valueOf(c))) {
				return true;
			}
		}

		return false;
	}
}
