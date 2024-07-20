package com.arrays;

public class BubbleShort {
	
	public static void shorting(int [] arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printarray(int[]arr) {
		for(Integer i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr= {9,8,7,5,2,1,4,3,6};
		System.out.println("Array before shoring: ");
		printarray(arr);
		shorting(arr);
		System.out.println("Array After Shorting: ");
		printarray(arr);
		
	
		

	}

}
