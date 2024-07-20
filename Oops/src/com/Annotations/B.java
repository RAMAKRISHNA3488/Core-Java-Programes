package com.Annotations;

import java.util.ArrayList;
import java.util.List;

public class B {

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a);
		a.mymethod();
		a.mymethod1();
		
		List list= new ArrayList();
		System.out.println(list);

	}

}
