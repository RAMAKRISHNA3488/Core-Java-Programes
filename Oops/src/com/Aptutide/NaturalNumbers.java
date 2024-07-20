package com.Aptutide;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Enter a any Number:  ");
		Scanner scanner = new Scanner(System.in);
		int natural_number = scanner.nextInt();// 50
		int result = 0;
		for (int i = 0; i <= natural_number; i++) {
			result = result + i;
		}
		System.out.println("The Sum of first " + 
		natural_number + " natural numbers is " + result);//result is 1275
	}
}
