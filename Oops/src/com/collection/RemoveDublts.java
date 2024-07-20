package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDublts {


	public static void removedublicate(char a[], int n) {
		HashSet<Character> set = new LinkedHashSet<>();
		for (Character c : a) {
			set.add(c);

		}
		for (Character character : set) {
			System.out.print(character);

		}

	}

	public static void main(String[] args) {
		char a[] = "ramakrishna".toCharArray();
		System.out.println(a);
		int n = a.length;
		removedublicate(a, n);
		

	}

}
