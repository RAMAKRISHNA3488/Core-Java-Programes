package com.ram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringDemo {
	public static void main(String[] args) {
		String s="Ramakrishna";
		List<String>list= new ArrayList<>();
		list.add(s);
		System.out.println(list);
		Set<String>set= new TreeSet<>();
		set.add(s);
		
		for (String string : set) {
			System.out.println(string);
		}
		
	}
}
