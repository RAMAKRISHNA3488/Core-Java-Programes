package com.interveiw;

/*N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9*/
public class MissingNumber {
	public static void MissNum(int[] nums, int N) {
		int diff = nums[0] - 0;
		for (int i = 1; i < N; i++) {
			if (nums[i] - i != diff) {
				while (diff < nums[i] - i) {
					System.out.print((i + diff) + " ");
					diff++;
				}
			}

		}

	}

	public static void main(String[] args) {
		int nums[] = { 6, 1, 2, 8, 3, 4, 7, 10, 11 };
		int N = nums.length;
		MissNum(nums, N);
	}

}
