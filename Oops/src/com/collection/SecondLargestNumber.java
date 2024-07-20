package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Integer[] I = { 98, 56, 21, 36, 54, 8, 99, 1000, 45 };

		List<Integer> list = Arrays.asList(I);
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

	}

}
