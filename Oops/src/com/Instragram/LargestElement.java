package com.Instragram;

public class LargestElement {
	
	public static void smallestNumber(int[] arr) {
		int smallnumber=arr[0];
		for(int j=1;j<arr.length;j++) {
			if(arr[j]<smallnumber) {
				smallnumber=arr[j];
			}
		}
		System.out.println("Smallest number: "+smallnumber);
		
	}
	public static void main(String[] args) {
		int[] arr= {5,7,3,9,2,8,4,1,6};
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
		
		smallestNumber(arr);
		
		
	}

}
