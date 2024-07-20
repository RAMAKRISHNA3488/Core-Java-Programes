package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
	public static void main(String[] args) {
		Set<String>set= new TreeSet<>(new ComparatorDmeo());
		set.add("abc");
		set.add("xyzzz");
		set.add("nmoo");
		set.add("rsttttttttttt");
		System.out.println(set);
		for (String object : set) {
			System.out.println(object);
		}
	}

}
