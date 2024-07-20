package com.ram.Starting;

public class Searching {
	// this is linear Searching method
	public static int linearSearch(int num[], int target, int len) {
		int step = 0;
		for (int i = 0; i < len; i++) {
			step++;
			if (num[i] == target)
				return i;
			
		}
		
		return -1;
	}

//this is Binary Search
	public static int BinarySearch(int num[], int target, int left, int right) {
		int Step = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			Step++;
			System.out.println("Number of Steps1: " + Step);
			if (num[mid] == target) {
				return mid;
			} else if (num[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	// recursion
	public static int binarySearch(int num[], int target, int left, int right) {
		int step = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			step++;
			if (num[mid] == target) {
				System.out.println("Number of Steps: " + step);
				return mid;
			} else if (num[mid] < target) {
				return binarySearch(num, target, left + 1, right);
			} else {
				return binarySearch(num, target, left, right + 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 this are index
		// 1 2 8 44 6 9 15 13 20 this are values
		int num[] = { 1, 2, 8, 44, 6, 9, 15, 13, 20 };
		int target = 15;
		int len = num.length;
		int left = 0;
		int right = num.length - 1;
		int result = linearSearch(num, target, len);
		// int result = BinarySearch(num, target, left, right);
		int result2 = binarySearch(num, target, left, right);

		if (result != -1)
			System.out.println("The Target index value is " + result);
		else
			System.out.println("Element not found.");
		if (result2 != -1)
			System.out.println("The Target index value is " + result);
		else
			System.out.println("Element not found.");
	}

}
