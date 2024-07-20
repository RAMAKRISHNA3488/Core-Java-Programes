package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class EvenAverage {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		OptionalDouble average = list.stream().filter(x->x%2==0).mapToInt(x->x).average();
		System.out.println(average);
	}

}
