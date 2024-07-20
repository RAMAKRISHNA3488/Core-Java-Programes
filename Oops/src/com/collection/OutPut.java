package com.collection;

import java.util.ArrayList;

public class OutPut {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("Z");
		obj.add("A");
		obj.add("B");
		obj.ensureCapacity(0);
		System.out.println(obj.size());

	}

}
