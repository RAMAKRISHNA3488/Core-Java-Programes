package Simpleprogram;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int row = 0; row < num; row++) {
			for (int j = 0; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
