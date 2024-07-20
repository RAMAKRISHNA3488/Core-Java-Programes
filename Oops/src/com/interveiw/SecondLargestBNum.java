package com.interveiw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.*/
public class SecondLargestBNum {
	public static void Second(int num[]) {
		int temp = 0;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] < num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
	}

	public static int Largest(int[] num) {
		int temp = 0;
		int n = 0;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] < num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		n = num[1];
		return n;
	}
	

	public static void PalindromNumber(int num1) {
		int sum = 0, r;
		int temp = num1;
		while (num1 > 0) {
			r = num1 % 10;
			sum = sum * 10 + r;
			num1 = num1 / 10;
		}
		if (temp == sum) {
			System.out.println(sum + " is Palindrom Number");
		} else {
			System.out.println(sum + " is not Palindrom Number");
		}

	}

	public static void main(String[] args) {
		int[] num = { 12, 35, 1, 10, 34, 1 };

		Second(num);
		int n = num[1];
		System.out.println("second Largest number : Using Loops : " + n);
		System.out.println(Arrays.toString(num));
		List<Integer> number = Arrays.asList(12, 35, 1, 10, 34, 1);
		number.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		;
		System.out.println("return: " + Largest(num));

		int num1 = 121;
		PalindromNumber(num1);
	}

}
