package Simpleprogram;

import java.util.Scanner;

public class Pattren {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println(result);
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		boolean falt = false;
		for (int i = 0; i < num1; i++) {
			if (i % 2 == 0)
				falt = true;
			break;
		}

	}

}
