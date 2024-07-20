package Simpleprogram;

import java.util.Scanner;

public class ArraysDay7HR {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = 0; i < n; i++) {
			System.out.print(arr[(n - 1) - i] + " ");
		}

	}

}
