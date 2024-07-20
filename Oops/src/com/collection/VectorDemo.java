package com.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("ram");
		vector.add("krishna");
		vector.add(0, "surya");
		vector.add("riya");

		System.out.println(vector);
		System.out.println("Size: " + vector.size());
		System.out.println("Size: " + vector.capacity());

		vector.add(0, "Vennala");

		vector.add("anitha");
		System.out.println(vector);
		for (String string : vector) {
			System.out.println(string);

		}
		System.out.println(vector.hashCode());
	}

}
