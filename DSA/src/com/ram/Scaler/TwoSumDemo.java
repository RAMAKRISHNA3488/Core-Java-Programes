package com.ram.Scaler;

import java.util.HashMap;

public class TwoSumDemo {

	public static void main(String[] args) {
		int arr[] = { 15, 7, 5, 3, 4, 2, 10 };
		int target = 25;
		int ans[] = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int sol = target - arr[i];
			if (map.containsKey(sol)) {
				ans[0] = map.get(sol);
				ans[1] = i;
				break;

			}
			map.put(arr[i], i);
		}
		System.out.println("[" + ans[0] + " " + ans[1] + "]");
	}
}
