package com.Aptutide;

import java.util.Scanner;

public class SumofOddNums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Natural Number:");
		int natural_number1 = scanner.nextInt();
		int result1 = 0;
		for (int i = 0; i <natural_number1; i++) {
			if (i % 2 != 0) {
				result1 = result1 + i;
			}
		}
		System.out.println("Enter second Natural Number:");
		int natural_number2 = scanner.nextInt();
		int result2 = 0;
		for (int i = 0; i <=natural_number2; i++) {
			if (i % 2 != 0) {
				result2 = result2 + i;
			}
		}
		int N=result2-result1;
		System.out.println(N);

	}

}
