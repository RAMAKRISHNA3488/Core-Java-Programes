package com.Aptutide;

import java.util.Scanner;

public class SumOfOddNumsUpto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Natural Number:");
		int natural_number = scanner.nextInt();
		int result = 0;
		for (int i = 1; i < 2 * natural_number-1; i++) {
			if (i % 2 != 0) {
				result = result + i;
			}
		}
		System.out.println(result+" the sum of odd numbers up to "+natural_number);

	}

}
