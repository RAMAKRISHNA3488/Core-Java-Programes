package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class reverse {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(90);
		list.add(1);
		list.add(45);
		list.add(87);
		list.add(62);

		System.out.println("Before Remove:" + list);
		list.remove(5);
		System.out.println("After removre:" + list);
		list.add(12);
		list.add(5, 1000);
		System.out.println("Add the elements:" + list);

		list.removeAll(list);
		System.out.println(list);
	}

}
