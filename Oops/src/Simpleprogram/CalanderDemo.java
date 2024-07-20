package Simpleprogram;

import java.util.Scanner;

public class CalanderDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Number of Days");
		Scanner scanner= new Scanner(System.in);
		int Days=scanner.nextInt();
		int years = Days / 365;
		System.out.println("The number of Years: " + years);

	}

}
