package com.ram.Scaler;

import java.util.HashMap;

//Think of the Brute force approach

//arr=[11,3,7,9,14,2] and target=17---->target-arr[i]
public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 11, 3, 7, 9, 14, 2 };
		int target = 17;
		int[] ans = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int sno = target - arr[i];
			if (map.containsKey(sno)) {
				ans[0] = map.get(sno);
				ans[1] = i;
				break;
			}
			map.put(arr[i], i);
		}
		System.out.println(ans[0] + " " + ans[1]);
	}
}
