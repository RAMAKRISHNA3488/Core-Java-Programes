package com.ram.Scaler;

import java.util.Scanner;

public class ReverseArrya {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}

		int i = 0;
		int j = num - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < num; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
