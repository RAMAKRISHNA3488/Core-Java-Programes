package com.collection;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new IdentityHashMap<>();
		Integer id1 = new Integer(200);
		Integer id2 = new Integer(20);

		map.put(id1, "ram");
		map.put(id2, "krishna");
		map.put(233, "surya");
		map.put(767,"krish");
		System.out.println("Before the Set");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator i = set.iterator();
		System.out.println("After the Set");
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print("Name:Scores: " + me.getKey() + ":");
			System.out.println(me.getValue());
		}

	}

}
