package com.Aptutide;

import java.util.Scanner;

public class NumberSystem {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);
		int natural_number = scanner.nextInt();// this is natural number
		int result = 0;
		for (int i = 0; i <= natural_number; i++) {
			if (i % 2 == 0)
				result = result + i;
		}
		System.out.println(result);
	}
}
