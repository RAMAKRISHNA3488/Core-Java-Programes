package com.arrays;

public class PairOfDigit {
	public static int[] SumOfPair(int []nums,int target) {
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int sum=nums[left]+nums[right];
			if(sum==target) {
				return new int[] {nums[left],nums[right]};
				//return new int [] {left,right};
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		int [] nums= {5,10,5,6,7,2,9};
		int target=12;
		int []result=SumOfPair(nums, target);
		   if (result != null) {
	            System.out.println("Pair with sum " + target + ": (" + result[0] + ", " + result[1] + ")");
	        } else {
	            System.out.println("No pair found with sum " + target);
	        }
	}

}
