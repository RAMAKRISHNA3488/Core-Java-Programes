package com.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("ram", 90);
		map.put("tom", 90);
		map.put("ram", 30);
		map.put("krishna", 60);
		System.out.println(map);
		Set<String> set = map.keySet();
		System.out.println("keys:" + set);
		Collection<Integer>values=map.values();
		System.out.println("valuse:" + values);
		for (String keyset : set) {
			System.out.println("keyset: " + keyset + " values: " + map.get(keyset));

		}


	}

}
