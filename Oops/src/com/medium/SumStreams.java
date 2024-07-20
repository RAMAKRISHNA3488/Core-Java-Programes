package com.medium;

import java.util.Arrays;

public class SumStreams {

	public static void main(String[] args) {
		var array= new int[] {1,2,3,4,5};
		var sum=Arrays.stream(array).sum();
		System.out.println(sum);

	}

}

