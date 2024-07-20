package com.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AvoidNestingStream {

	public static void main(String[] args) {
		var list1 = Arrays.asList("Apple", "Banana", "Cherry");
		var list2 = Arrays.asList("Orange", "Pineapple", "Mango");
		List<String> result = Stream.concat(list1.stream(), list2.stream()).filter(s -> s.length() > 5)
				.collect(Collectors.toList());
		System.out.println(result);
		var r1 = list1.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(r1);
		var r2 = list1.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(r2);

	}

}
