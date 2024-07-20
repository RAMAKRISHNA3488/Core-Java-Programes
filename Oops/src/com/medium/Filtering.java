package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(6);

		System.out.println(list);

		// Finding First number After 5
		List<Integer> list2 = list.stream().filter(s -> s > 5).collect(Collectors.toList());
		// Finding largest Number in list
		System.out.println(list2);
		list.stream().sorted(Comparator.reverseOrder()).skip(0).limit(1).forEach(System.out::println);

		List<Integer> list3 = list.stream().filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toList());
		System.out.println(list3);
		// Finding Use Distinct() to remove duplicates numbers or Repeated numbers
		var list4 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list4);

		var List = Arrays.asList(2, 4, 5, 6, 3, 9, 8);
		// Adding all Numbers in List
		var sum = List.parallelStream().reduce(0, Integer::sum);// parallel stream with caution
		System.out.println(sum);
		// Finding First number After 3
		var result = List.stream().filter(n -> n > 3).findFirst();
		System.out.println(result);
		// Filtering Even Numbers
		var filterList = List.stream().filter(i -> i % 2 == 0).map(i -> i * 2).collect(Collectors.toList());
		System.out.println(filterList);// Use filter() before map() to avoid unnecessary processing
		// Finding Sorted List
		var sortedList = List.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		// this is peek
		List<String> string = Stream.of("Ram", "Krishna", "Krish", "Ramakrishna").filter(s -> s.length() > 3)
				.peek(s -> System.out.println("Filtered Vales: " + s)).map(String::toUpperCase)
				.peek(s -> System.out.println("Mapped Vales: " + s)).collect(Collectors.toList());
		System.out.println(string);
		// return true whether all elements of this stream match otherwise false
		boolean match = List.stream().allMatch(num -> num % 2 == 0);
		System.out.println(match);
		boolean anyMatch = List.stream().anyMatch(num2 -> num2 % 2 == 0);
		System.out.println(anyMatch);

		List.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(s -> System.out.println(s));
		List.stream().sorted(Comparator.reverseOrder()).findAny().ifPresent(s -> System.out.println(s));
	}

}
