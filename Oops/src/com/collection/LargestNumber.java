package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		Integer []array= {100,5,25,69,321,999,456,723};
		List<Integer>list=Arrays.asList(array);
		list.stream().sorted(Comparator.reverseOrder()).skip(0).limit(1).forEach(System.out::println);
		list.stream().sorted(Comparator.naturalOrder()).skip(0).limit(1).forEach(System.out::println);

	}

}
