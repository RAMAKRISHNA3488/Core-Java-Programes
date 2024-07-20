package com.ram;

import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a any Character: ");
		char c = scanner.next().charAt(0);
		int ASCIIValue = (int) c;
		System.out.println(ASCIIValue);
	}
}
