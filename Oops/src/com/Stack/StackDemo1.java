package com.Stack;

import java.util.Scanner;

public class StackDemo1 {

	public static void push() {

	}

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.Display");
			System.out.println("5.exit");
			System.out.println("Choose one Number: ");
			int num = scanner.nextInt();

			if (num == 1) {
				System.out.println("Push operation: ");
			} else if (num == 2) {
				System.out.println("pop operation:");
			} else if (num == 3) {
				System.out.println("peek operation:");
			} else if (num == 4) {
				System.out.println("Display operation");
			} else {
				System.out.println("You choose wrong number!");
				System.out.println("Sorry you Don't go next step!");
				break;
			}
		}
	}

}
