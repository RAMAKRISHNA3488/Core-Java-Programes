package com.Java8;

import java.util.function.Predicate;

public class PredicateMethod {

	public static void main(String[] args) {

		int x[] = { 1, 5, 7, 10, 20, 30, 33, 46, 99, 100, 6, 5, 90, 3 };

		Predicate<Integer> p1 = i -> (i > 10);
		System.out.println("Greater then 10");
		method(p1, x);

	}

	static void method(Predicate<Integer> p, int[] x) {

		for (int eachvalue : x) {
			if (p.test(eachvalue)) {
				System.out.println(eachvalue);
			}
		}
	}

}
