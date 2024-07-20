package com.interveiw;

public class ArrayDemo {
	public static int removing(int n, int[] a) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 21, 3, 6, 9, 1, 2, 3, 5, 6, 5, 5, 9, 2, 2, 1 };
		int n = arr.length;
		int j = 0;
		j = removing(n, arr);
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");

		}
		int x=10;
		System.out.println("Square of X : "+Math.sqrt(x));
		System.out.println(Math.absExact(x));
	}

}
