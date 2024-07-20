package com.interveiw;

public class Maximum_SubArray {

	public static void MaxSum(int nums[]) {
		int AllSum = 0;
		for (int i = 0; i < nums.length; i++) {
			AllSum = AllSum + nums[i];

		}
		System.out.println("Sum of all deigits: " + AllSum);
	}
	public static int MaxSum1(int nums[]) {
	
		int result=nums[0];
		int sum=nums[0];
		for(int i=1;i<nums.length;i++) {
			sum=Math.max(nums[i], sum+nums[i]);
			result=Math.max(result, sum);
			System.out.println("i : "+nums[i]);
			System.out.println("Sum : "+sum);
			System.out.println("Result : "+result);
			
		}
		return result;
	}
	

	public static void main(String[] args) {
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		MaxSum(nums);
		System.out.println(MaxSum1(nums));
	}

}
