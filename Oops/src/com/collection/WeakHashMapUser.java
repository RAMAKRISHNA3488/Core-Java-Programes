package com.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapUser {

	public static void main(String[] args) throws InterruptedException {
		Map<User, String> map = new WeakHashMap<>();
		User u = new User();
		map.put(u, "tom");
		map.put(u, "ram");
		System.out.println(map);
		u = null;
		System.gc();
		Thread.sleep(5000);
		

	}

}
