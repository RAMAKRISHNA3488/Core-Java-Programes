package com.Sheet;

public class ReverseArrays {
	public static void reverse(int[]nums,int start,int last) {
		int temp;
		if(start>last) 
			return;
			temp=nums[start];
			nums[start]=nums[last];
			nums[last]=temp;
			reverse(nums, start+1, last-1);
	}
	
	public static void reverseString(String[] string,int first,int last1) {
		String temp;
		if(first>=last1)
			return;
		temp=string[first];
		string[first]=string[last1];
		string[last1]=temp;
		reverseString(string, first+1, last1-1);
	}
	public static void PrintArrayInt(int[] nums) {
		for(int i=0;i<nums.length;i++) 
			System.out.print(nums[i]+" ");
		System.out.println();
		
	}
	public static void PrintArrayString(String[] string) {
		for(int i=0;i<string.length;i++) 
			System.out.print(string[i]+" ");
		System.out.println();
		
	}
	public static void main(String[] args) {
		int [] nums= {10,20,30,40,50,60};
		int start=0;
		int last=5;
		System.out.println("Orginal Integer Array");
		PrintArrayInt(nums);
		reverse(nums, start, last);
		System.out.println("Reverse Integer Array");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		
		
		String[] string= {"R","A","M"};
		int first=0;
		int last1=2;
		System.out.println();
		System.out.println("Orginal String Array");
		PrintArrayString(string);
		reverseString(string, first, last1);
		System.out.println("Reverse String Array");
		for(int j=0;j<string.length;j++) {
			System.out.print(string[j]+" ");
		}
	}

}
