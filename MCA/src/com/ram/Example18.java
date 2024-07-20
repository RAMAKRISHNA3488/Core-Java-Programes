package com.ram;

import java.util.Scanner;

public class Example18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		if (number <= 0) {
			System.out.println("Please enter a positive integer.");
			return;
		}

		int result = sumDigitsUntilSingleDigit(number);

		System.out.println("Sum of digits until a single digit: " + result);
	}

	public static int sumDigitsUntilSingleDigit(int num) {
		while (num >= 10) {
			int sum = 0;
			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num;
	}
}
