package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new java.util.IdentityHashMap<>();

		map.put("RAM", 54612);
		map.put("KRISHNA", 45125);
		map.put("TEJ", 12545440);
		map.put("SURYA", 515);
		map.put("BALAJI", 478154);
		map.put("DORADO", 10245);

		Set s = map.entrySet();
		Iterator i = s.iterator();

		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
	}

}
