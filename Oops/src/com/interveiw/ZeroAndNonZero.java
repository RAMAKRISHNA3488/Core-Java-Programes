package com.interveiw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ZeroAndNonZero {

	public static void main(String[] args) {
		int[] inputarr = { 10, 2, 0, 8, 0, 6, 44, 5, 9, 0, 1, 0, 3, 0 };
		int count = 0;
		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] != 0) {
				inputarr[count] = inputarr[i];
				count++;
			}
		}
		while (count < inputarr.length) {
			inputarr[count] = 0;
			count++;

		}
		System.out.println(Arrays.toString(inputarr));
		
		Set<Integer>set=new HashSet<>();
		for(Integer j:inputarr) {
			set.add(j);
		}
		System.out.println("This is set"+set);
		
		
		//adding all elements in the array
		int sum=0;
		for(Integer g:inputarr) {
			sum +=g;
			
		}
		System.out.println(sum);
		//finding the second largest number
		Arrays.sort(inputarr);
		for(int i=0;i<inputarr.length;i++) {
			if(i==inputarr.length-2)
				System.out.println(inputarr[i]);
			if(i==inputarr.length-1)
				System.out.println(inputarr[i]);
		}
		List<Integer>list=new ArrayList<>();
		for(Integer text:inputarr) {
			list.add(text);
		}
		System.out.println("This is List"+list);
		Set<Integer>set1=new HashSet<>();
		for(Integer j:inputarr) {
			set.add(j);
		}
		System.out.println("This is set"+set1);
	}

}
