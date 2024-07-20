package com.ram;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();

		System.out.print("Enter the third number: ");
		int thirdNumber = scanner.nextInt();

		boolean result = checkNumbers(firstNumber, secondNumber, thirdNumber);

		System.out.println("Result: " + result);
	}

	public static boolean checkNumbers(int first, int second, int third) {
		if (second > first && third > second) {
			return true;
		} else if (third > second) {
			return true;
		}
		return false;
	}

}
