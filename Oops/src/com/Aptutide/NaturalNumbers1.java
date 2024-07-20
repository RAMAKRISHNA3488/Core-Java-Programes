package com.Aptutide;

import java.util.Scanner;

public class NaturalNumbers1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a any Natural number: ");
		int natural_number = scanner.nextInt();
		System.out.println("Enter a any multiple of number:");
		int multiple_number = scanner.nextInt();
		int result = 0;
		for (int i = 0; i < natural_number; i++) {
			if (i % multiple_number == 0) {
				result = result + i;
			}
		}
		System.out.println(result + " is the sum of Natural numbers upto " 
		+ natural_number + " which are multiples of "+ multiple_number);
	}

}
