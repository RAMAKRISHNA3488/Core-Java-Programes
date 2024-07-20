package com.arrays;

import java.util.Arrays;

public class TraversalArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		System.out.println("Traversing the array using a for loop:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("Traversing the array using an enhanced for loop:");
		for (int num : numbers) {
			System.out.println(num);
		}

		Arrays.sort(numbers);
		System.out.println("After Sorting the Array:");
		for (int num1 : numbers) {
			System.out.println(num1);
		}

	}

}
