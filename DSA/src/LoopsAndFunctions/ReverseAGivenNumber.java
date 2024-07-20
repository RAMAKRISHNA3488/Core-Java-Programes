package LoopsAndFunctions;

import java.util.Scanner;

public class ReverseAGivenNumber {
	public static void main(String[] args) {
		int reminder, start = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();

		while (num > start) {
			reminder = num % 10;
			System.out.print(reminder);
			num = num / 10;
		}
	}

}
