package com.Aptutide;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a any First Natural Number: ");
		int natural1 = scanner.nextInt();// 24
		int natural_1 = natural1 - 1;// 24-1=23
		int result1 = 0;
		for (int i = 0; i <= natural_1; i++) {
			result1 = result1 + i;
		}
		System.out.println("Enter a any secound Natural Number: ");
		int natural2 = scanner.nextInt();// 76
		int result2 = 0;
		for (int i = 0; i <= natural2; i++) {
			result2 = result2 + i;
		}
		int result = result2 - result1;// 2650
		System.out.println(result + " is the sum of Natural numbers from " + natural1 + " to " + natural2);
	}

}
