package Com.Ram.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbers {

	public static int[] TwoSums(int[]nums,int target) {
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			//Returns true if this map contains a mapping for the specifiedkey. More formally,
			//returns true if and only ifthis map contains a mapping for a key k such that Objects.equals(key, k). 
			//(There can beat most one such mapping.)
			if(map.containsKey(complement)) {
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 5, 5, 11, 9, 8, 4 };
		int target = 15;
		int[] twoSums = TwoSums(nums, target);
		System.out.println(twoSums[0]+" "+twoSums[1]);
	}

}
