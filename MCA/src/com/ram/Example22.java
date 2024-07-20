package com.ram;

import java.util.Scanner;

public class Example22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second integer: ");
		int num2 = scanner.nextInt();

		int result = multiplyWithoutOperator(num1, num2);

		System.out.println("Result of multiplication: " + result);
	}

	public static int multiplyWithoutOperator(int num1, int num2) {
		int result = 0;

		for (int i = 0; i < Math.abs(num2); i++) {
			result += num1;
		}

		if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
			result = -result;
		}

		return result;
	}
}
