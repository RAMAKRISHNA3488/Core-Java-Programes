package Basic_of_Programming;

import java.util.Scanner;

//Java Program to Find Sum of n Natural Numbers

public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number:  ");
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of " + num + " Natural Numbers is " + sum);

	}

}
