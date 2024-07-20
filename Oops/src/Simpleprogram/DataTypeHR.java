package Simpleprogram;

import java.util.Scanner;

public class DataTypeHR {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		A = A.toLowerCase();
		B = B.toLowerCase();
		int l = A.length();
		int l1 = B.length();
		System.out.println(l + l1);
		if (A.compareTo(B) < 0) {
			System.out.println("No");
			A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
			B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
			System.out.println(A + " " + B);

		} else if (A.compareTo(B) == 0) {
			System.out.println("No");
			A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
			B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
			System.out.println(A + " " + B);

		} else {
			System.out.println("Yes");
			A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
			B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
			System.out.println(A + " " + B);

		}
	}

}
