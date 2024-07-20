package com.medium;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SplitAsStreamDemo {

	public static void main(String[] args) {
		// this is the Split method
		Stream<String> words = Pattern.compile(" ").splitAsStream("Hey There Ram");
		words.forEach(System.out::println);

		IntStream chars = "Hey Ram!".chars();
		chars.forEach(System.out::println);
		
		//builder
		Stream.Builder<String>city=Stream.builder();
		city.add("Londan").add("India").add("Japan");
		city.accept("Etaly");
		Stream<String>stream=city.build();
		
		
		List<Integer>list=List.of(1,4,5,7,8,10);
		Optional<Integer> optional=list.stream().reduce((a,b)->a+b);
		System.out.println(optional);
		
		int optional1=list.stream().reduce(1,(a,b)->(a+b)/2);
		System.out.println(optional1);
		
	}

}
