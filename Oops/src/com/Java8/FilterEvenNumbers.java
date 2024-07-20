package com.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);

		}
		System.out.println("Normal List: "+list);

		List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Evenn Numbers: "+list1);

		List<Integer> list2 = new ArrayList<>();
		for (Integer i : list) {
			if (i % 2 != 0) {
				list2.add(i);
			}
		}
		System.out.println("Odd numbers: "+list2);
	}

}
