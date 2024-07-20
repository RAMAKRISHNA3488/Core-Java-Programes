package com.medium;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// Stream
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		stream.forEach(p -> System.out.println(p));
		// loop
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		for (int i : my_array) {
			System.out.print(i + " ");
		}
	}
}
