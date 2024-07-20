package com.ram;

public class SwapFirstLast {
	public static void main(String[] args) {
		int temp = 0;

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Befor Array: ");
		for (int elements : arr) {
			System.out.print(elements + " ");
		}
		temp = arr[0];
		arr[0] = arr[4];
		arr[4] = temp;

		System.out.println("\nAfter Array: ");
		for (int elements : arr) {
			System.out.print(elements + " ");
		}
	}
}
