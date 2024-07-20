package com.ram;

import java.util.Scanner;

public class DemoPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();

		for (int row = 1; row <= num; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			if (row == 1 || row == num) {
				//for (int j = 1; j <= row; j++) {
					System.out.print("*");
				//}
			} else {
//				System.out.print("*");
//				for(int col=1;col<=2*(row-1)-1;col++) {
//					System.out.println(" ");
//				}
				System.out.println(" ");
				//System.out.print("*");
			}
			System.out.println();
		}
	}

}
