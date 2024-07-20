package com.ram.Scaler;

import java.util.Scanner;

/*     0 1 2 
 * arr=[1,2,3]
 * 
 * si    ei    array
 * 0      0      1
 * 0      1      1,2
 * 0      2      1,2,3
 * 1      1       2
 * 1      2       2,3
 * 2      3        3
 * 
 * */
public class SubArray {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		// this is first index
		for (int s = 0; s < num; s++) {
			// this checking the last index
			for (int e = s; e < num; e++) {

				// printing the elements
				for (int i = s; i < e; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
		}
	}

}
