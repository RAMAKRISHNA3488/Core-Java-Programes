package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSetDemo1 {

	public static void main(String[] args) {
		Set<Integer>set=new TreeSet<>();

		int a[] = { 1, 2, 3, 4, 5, 45, 6, 789, 100,100,2,26,66,33,26, 9, 66, 33 };
		for (int i : a) {
			set.add(i);
		}
		set.add(22);
		set.add(11);
		System.out.println(set);

	}

}
