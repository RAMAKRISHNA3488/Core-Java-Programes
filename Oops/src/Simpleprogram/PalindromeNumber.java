package Simpleprogram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r, sum = 0, tem;
		int n = 121;
		tem = n;
		while (n != 0) {
			r = n % 10;
			System.out.println("r: " + r);
			sum = sum * 10 + r;
			System.out.println("sum: " + sum);
			n = n / 10;
			System.out.println("n: " + n);
		}
		if (tem == sum) {
			System.out.println(sum + " is Palindrom Number");
		} else {
			System.out.println(sum + " is not Palindrom Number");
		}

	}
}