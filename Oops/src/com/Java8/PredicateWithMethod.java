package com.Java8;

import java.util.function.Predicate;

public class PredicateWithMethod {

	public static void main(String[] args) {
		int[] x = { 0, 12, 3, 52, 63, 99, 85, 25, 14, 5, 7, 6 };
		Predicate<Integer> p = i -> (i > 10);
		Predicate<Integer> p1 = i -> (i % 2 == 0);
		Predicate<Integer> p2 = i -> (i % 2 == 1);

		System.out.println("Greater then 10:");
		method1(p, x);
		System.out.println("even Numbers");
		method1(p1, x);
		System.out.println("odd Numbers");
		method1(p2, x);

	}

	public static void method1(Predicate<Integer> p, int[] x) {
		for (int eachvalue : x) {
			if (p.test(eachvalue)) {
				System.out.print(eachvalue + " ");
			}
		}

		System.out.println();
	}

}
