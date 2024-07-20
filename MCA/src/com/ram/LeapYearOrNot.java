package com.ram;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Year: ");
		int year = scanner.nextInt();

		if (year % 4 == 0) {
			System.out.println(year + " is leap year.");
		} else {
			System.out.println(year + " is not Leap year");
		}
	}
}
