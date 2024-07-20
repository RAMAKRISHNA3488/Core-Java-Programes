package com.collection;

import java.util.TreeMap;

public class NavigableMap {

	public static void main(String[] args) {
		TreeMap<String, String> map=new TreeMap<>();
		map.put("abc", "ram");
		map.put("xyz", "rama");
		map.put("cde", "krishna");
		map.put("ghi", "pinkey");
		map.put("klm", "priyanka");
		map.put("nop", "surya");
		
		System.out.println(map);
		System.out.println(map.floorKey("klm"));
		System.out.println(map.lowerKey("nop"));
		System.out.println(map.ceilingKey("cde"));
		System.out.println(map.higherKey("ghi"));
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		System.out.println(map.descendingKeySet());
		System.out.println(map);

	}

}
