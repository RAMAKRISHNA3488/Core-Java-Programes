package com.Constructor;

import java.util.ArrayList;
import java.util.List;

public class TestParameterizedConstructor {
	public static void main(String[] args) {
		
		List<ParameterizedConstructor>list=new ArrayList<ParameterizedConstructor>();
		list.add(new ParameterizedConstructor(1, "Rama", 25));
		list.add(new ParameterizedConstructor(2, "Krishna", 25));
		ParameterizedConstructor test = new ParameterizedConstructor(1, "Rama", 25);
		ParameterizedConstructor test1 = new ParameterizedConstructor(2, "Krishna", 25);
		System.out.println("Id: " + test.getId());
		System.out.println("Name: " + test.getName());
		System.out.println("Age: " + test.getAge());
		
		if(test.getAge()==25) {
			System.out.println("Id: "+test.getId()+" Name: "+test.getName()+" Age: "+test.getAge());
		}
	}

}
