package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(100, "Ram");
		map.put(101, "Amrutha");
		map.put(102, "Naven");
		
		//this is list type to storing the elements
		System.out.println("This is Storing the elements into List");
		List<Entry<Integer, String>> list = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList();
		System.out.println(list);
		System.out.println("This is Storing the elements into iterator");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();
		
		Set set=map.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Entry) i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
