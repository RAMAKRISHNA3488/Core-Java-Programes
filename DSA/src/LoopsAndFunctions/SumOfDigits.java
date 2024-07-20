package LoopsAndFunctions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			// System.out.println("digit: " + digit);
			sum += digit;
			num = num / 10;
			// System.out.println("sum: " + sum);
		}
		System.out.println(sum);

	}

}
