package com.ram;

public class WithoutAdditionOperator {
	public static int add(int a, int b) {
		if (b == 0) {
			return a;
		}

		int sum = a ^ b;

		int carry = (a & b) << 1;

		return add(sum, carry);
	}

	public static void main(String[] args) {
		int a = 11, b = 20;

		System.out.println("Sum  is " + add(a, b));
	}
}
