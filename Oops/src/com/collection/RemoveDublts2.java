package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDublts2 {

	
	public static void main(String[] args) {
		char a[] = "ramakrishna".toCharArray();
		System.out.println(a);
		HashSet<Character> set = new LinkedHashSet<>();
		for (Character c : a) {
			set.add(c);

		}
		for (Character character : set) {
			System.out.print(character);

		}

	}

}
