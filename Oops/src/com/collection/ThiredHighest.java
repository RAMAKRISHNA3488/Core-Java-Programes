package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThiredHighest {

	public static void main(String[] args) {

		Integer a[]= {15,2,98,58,99,100,66,70};
		List<Integer>list=Arrays.asList(a);
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
	}

}
