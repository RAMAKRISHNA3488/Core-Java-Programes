package com.Aptutide;

import java.util.Scanner;

public class SumOfEvenNumsUpto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Natural Number:");
		int natural_number = scanner.nextInt();
		int result = 0;
		for (int i = 0; i <=natural_number; i++) {
			if (i % 2 == 0) {
				result = result + i;
			}
		}
		System.out.println(result);

	}

}
