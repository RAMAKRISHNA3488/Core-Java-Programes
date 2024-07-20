package com.collection;

import java.util.HashSet;
import java.util.Random;

public class DifferentSets {
	public static void main(String[] args) {
		System.out.println("List is: ");
		Random obj=new Random();
		HashSet<Integer> set=new HashSet<>();
		//LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		//Set<Integer> set =new TreeSet<>();
		
		for(int i=0;i<=5;i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
			
		}
		
		System.out.println("HashSet:"+set);
		//System.out.println("LinkedList: "+set);
		//System.out.println("TreeSet: "+set);
	}

}
