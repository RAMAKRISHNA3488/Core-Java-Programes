package com.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapSortedDemo {

	public static void main(String[] args) {
		Map<String, Integer>map=new HashMap<>();
		map.put("ram", 111);
		map.put("rama", 114);
		map.put("krishna", 113);
		map.put("pyari", 115);
		map.put("priyaka", 118);
		map.put("riya", 119);
		System.out.println("Before Sorted");
		System.out.println(map);
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

	    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		
	}

}
