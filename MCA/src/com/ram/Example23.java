package com.ram;

import java.time.YearMonth;
import java.util.Scanner;

public class Example23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = scanner.nextInt();

		System.out.print("Enter the month: ");
		int month = scanner.nextInt();

		if (month < 1 || month > 12) {
			System.out.println("Invalid month. Please enter a number between 1 and 12.");
			return;
		}

		YearMonth yearMonth = YearMonth.of(year, month);

		int daysInMonth = yearMonth.lengthOfMonth();

		System.out.println("Number of days in the month: " + daysInMonth);
	}
}
