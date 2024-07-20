package com.collection;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {

	public int findDuplicates(int[] num) {
		Set<Integer> seen = new HashSet<>();

		for (Integer nums : num) {
			if (seen.contains(nums))
				return nums;
			seen.add(nums);
			System.out.println(seen);
		}

		return -1;
	}

	public static void main(String[] args) {
		ArrayDuplicates array = new ArrayDuplicates();
		int[] num = { 1, 2, 3, 4, 5, 6, 9, 8, 7, 1, 2, 3, 6, 5, 4, 2, 1, 2 };
		array.findDuplicates(num);
	}

}
