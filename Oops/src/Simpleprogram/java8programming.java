package Simpleprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class java8programming {

	private static List<Integer> list;

	public static void main(String[] args) {
		list = Arrays.asList(10, 50, 10, 30, 20, 40, 20, 30);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());

		System.out.println(collect);

		Set<Integer> set = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
		System.out.println(set);
		
		int c=10;
		System.out.println(c);
		 c=20;
		 System.out.println(c);
	}
}
