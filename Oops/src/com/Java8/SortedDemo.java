package com.Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 3);
		map.put("b", 2);
		map.put("c", 1);
		System.out.println("before sorted");
		System.out.println(map);
		Stream<Entry<String, Integer>> sorted = map.entrySet().stream().sorted();
		System.out.println("After sorted");
		System.out.println(sorted);

	}

}
