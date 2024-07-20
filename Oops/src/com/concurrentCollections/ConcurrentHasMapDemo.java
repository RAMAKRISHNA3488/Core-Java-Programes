package com.concurrentCollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHasMapDemo extends Thread {
	static ConcurrentHashMap<String,String> courseRanges = new ConcurrentHashMap<String,String>();

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courseRanges.put("Dote","4.0");
	}

	public static void main(String[] args) throws InterruptedException {
		ConcurrentHasMapDemo mt = new ConcurrentHasMapDemo();
		mt.start();
		courseRanges.put("Java","5.0");
		courseRanges.put("Python","4.9");
		courseRanges.put("AWS","4.8");
		courseRanges.put("Docker","4.7");
		Iterator<String> iterator =  courseRanges.keySet().iterator();

		while (iterator.hasNext()) {
			Thread.sleep(1000);
			String course = iterator.next();
			System.out.println(course);

		}

		System.out.println(courseRanges);
	}

	
}
