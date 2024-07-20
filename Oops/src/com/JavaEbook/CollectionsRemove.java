package com.JavaEbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsRemove {
	public static void EnchanceRemove(List<String> fruits) {
		for (String fruit : fruits) {
			System.out.println(fruit);
			if ("Apple".equals(fruit)) {
				fruits.remove(fruit);
			}
		}
	}

	public static void ForUsing(List<String> fruits) {
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
			if ("Apple".equals(fruits.get(i))) {
				fruits.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		ForUsing(fruits);
		// EnchanceRemove(fruits);

	}

}
