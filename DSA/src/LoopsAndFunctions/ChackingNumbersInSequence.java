package LoopsAndFunctions;

import java.util.Scanner;

public class ChackingNumbersInSequence {
	public static void main(String[] args) {
		int reminder, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr any Number: ");
		int num = scanner.nextInt();
		int temp = num;
		while (num != 0) {
			reminder = num % 10;
			sum = sum * 10 + reminder;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}
	}

}
