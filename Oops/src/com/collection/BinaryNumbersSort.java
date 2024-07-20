package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//0 0 0 1 1 1 1 1 1
public class BinaryNumbersSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		System.out.println("before the sorting:"+list);
		list.stream().sorted().forEach(System.out::print);;

	}

}
