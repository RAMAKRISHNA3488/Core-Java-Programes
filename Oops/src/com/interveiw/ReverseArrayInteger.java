package com.interveiw;

public class ReverseArrayInteger {

	public static void Reverse(int nums[]) {
		int first = 0, last = 4;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[first];
			nums[first] = nums[last];
			nums[last] = temp;
			System.out.print(nums[i] + " ");
		}

	}

	public static void reverse1(int nums[], int first, int last) {

		while (last > first) {
			int temp = nums[first];
			nums[first] = nums[last];
			nums[last] = temp;
			first++;
			last--;

		}

	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5 };
		int first = 0, last = 4;
		// Reverse(nums);
		reverse1(nums, first, last);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
