package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		Stream1[] stream = { new Stream1(1, "Mickey Mouse", 10000), new Stream1(2, "Donald Duck", 15000),
				new Stream1(3, "Goofy Goo", 20000) };
		Stream1 stream1=new Stream1(4, "Mufasa", 50000);
		List<Stream1> list = new ArrayList<>();
		System.out.println(list);
	}

}
