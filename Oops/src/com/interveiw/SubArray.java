package com.interveiw;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArray {
	public static void findSubArray(ArrayList<Integer> arr, int sum, int N) {
		int CurSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i; j < arr.size(); j++) {
				CurSum = arr.get(j) + N;
				if (CurSum == sum) {
					System.out.println(arr.get(i) + " " + arr.get(j));
					// System.out.println(CurSum);
					return;
				}

			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int sum = 15;
		int N = 10;
		findSubArray(arr, sum, N);

	}

}
