package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("ram", 90);
		map.put("tom", 90);
		map.put("ram", 30);
		map.put("krishna", 60);
		Set<String> set=map.keySet();
		System.out.println("keys:"+set);
		
		Collection<Integer> values = map.values();
		System.out.println("valuse:"+values);
		for (String keyset : set) {
			System.out.println("keyset: "+keyset+" is values: "+map.get(keyset));
			
		}

	}

}
