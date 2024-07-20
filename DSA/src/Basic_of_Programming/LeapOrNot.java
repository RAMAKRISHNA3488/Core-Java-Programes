package Basic_of_Programming;

import java.util.Scanner;


public class LeapOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any Year: ");
		int year = scanner.nextInt();

		if (year % 400 != 0) {
			if (year % 100 == 0) {
				System.out.println(year + " is not a Leap year.");
			} else if (year % 4 == 0) {
				System.out.println(year + " is a Leap Year.");
			} else {
				System.out.println(year + " is not a Leap year.");
			}
			
		} else {
			System.out.println(year + " is a Leap Year.");
		}
	}
}
