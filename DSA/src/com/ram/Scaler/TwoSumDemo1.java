package com.ram.Scaler;

import java.util.HashMap;

public class TwoSumDemo1 {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int len = nums.length;
		int target = 12;
		int ans[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < len; i++) {
			int s = target - nums[i];
			if (map.containsKey(s)) {
				ans[0] = map.get(s);
				ans[1] = i;
				break;
			}
			map.put(nums[i], i);
		}
		System.out.println(ans[0]+" "+ans[1]);
	}
}
