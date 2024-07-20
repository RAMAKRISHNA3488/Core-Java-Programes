package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Converstion {
	// instance method
	public static void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I hate girls: " + i);
		}
	}

	public void method2() {
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println("I am runner....");
		}
	}

	public void converstion() {
		System.out.println("I am Ram");
	}

	public static void main(String[] args) {
		// static reference method
		Thread t = new Thread(Converstion::method1);
		t.start();
		// Instance reference method
		Thread t2 = new Thread(new Converstion()::converstion);
		t2.start();
		/*
		 * Thread t1=new Thread(new Converstion()::method2); t1.start();
		 */
		// converting Array to list
		String array[] = { "one", "two", "three", "four" };
		List<String> list = Arrays.asList(array);
		System.out.println("Array to list: " + list);
		// Filtering
		List<String> collect = list.stream().filter(i -> i.length() > 4).collect(Collectors.toList());
		System.out.println("Filtering: " + collect);
		// iteration
		for (String iterater : list) {
			System.out.println("iteration:" + iterater);
		}

		// converting list to Array
		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		String[] array1 = list2.toArray(new String[0]);
		System.out.println("ListToArray: " + array1);
		list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		list2.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

		// Converting list to set
		List<String> list3 = new ArrayList<>();
		list3.add("ram");
		list3.add("krishna");
		list3.add("krish");
		list3.add("ramakrishna");
		list3.add("rama");
		Set<String> set = new HashSet<>(list3);
		System.out.println(set);

		// Converting set to list
		List<String> list4 = new ArrayList<>(set);
		System.out.println(list4);

		// Converting map to list
		Map<String, Integer> map = new HashMap<>();
		map.put("vennala", 1);
		map.put("ram", 2);
		map.put("surya", 3);
		map.put("rahul", 4);
		List<Map.Entry<String, Integer>> list5 = new ArrayList<>(map.entrySet());
		System.out.println(list5);

		// converting list of maps to map
		List<Map<String, Integer>> list6 = new ArrayList<>();
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("vennala", 1);
		map1.put("ram", 2);
		map1.put("surya", 3);
		map1.put("rahul", 4);
		list6.add(map1);
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("ventat", 5);
		list6.add(map2);
		Map<String, Integer> map3 = new HashMap<>();
		for (Map<String, Integer> map4 : list6) {
			for (Map.Entry<String, Integer> map5 : map4.entrySet()) {
				map4.put(map5.getKey(), map5.getValue());

				System.out.println(map4);
			}
		}

		// Converting List to Map
		List<String> list7 = new ArrayList<>();
		list7.add("ram");
		list7.add("krishna");
		list7.add("krish");
		list7.add("ramakrishna");
		list7.add("rama");
		Map<String, Integer> map6 = new HashMap<>();
		for (int i = 0; i < list7.size(); i++) {
			map6.put(list7.get(i), i);
			System.out.println(map6);
		}

		// Converting set to array
		Set<String> set1 = new HashSet<>();
		set1.add("ram");
		set1.add("krishna");
		set1.add("krish");
		set1.add("ramakrishna");
		set1.add("rama");
		String[] arr = set1.toArray(new String[0]);
		System.out.println(arr);

		// converting Array to Set
		String[] arr1 = { "Apple", "Banana", "painApple", "Carry" };
		Set<String> set3 = new HashSet<>(Arrays.asList(arr1));
		System.out.println(set3);

		// converting map to set
		Map<String, Integer> map7 = new HashMap<>();
		map7.put("priya", 4);
		map7.put("ram", 3);
		map7.put("surya", 2);
		map7.put("rahul", 1);
		Set<Map.Entry<String, Integer>> set7 = new HashSet<>(map7.entrySet());
		System.out.println(set7);

	}

}
