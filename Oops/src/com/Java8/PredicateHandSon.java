package com.Java8;

import java.util.function.Predicate;

public class PredicateHandSon {

	public static void main(String[] args) {

		Predicate<Integer> p=i->(i>20);
		System.out.println(p.test(15));
		System.out.println(p.test(55));
		System.out.println(p.test(25));
	}

}
