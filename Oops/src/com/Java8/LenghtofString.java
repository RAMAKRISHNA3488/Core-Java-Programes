package com.Java8;

import java.util.function.Predicate;

public class LenghtofString {

	public static void main(String[] args) {
		Predicate<String> p = s -> (s.length() > 5);
		System.out.println(p.test("xyz"));
		System.out.println(p.test("Ramakrishna"));

	}

}
