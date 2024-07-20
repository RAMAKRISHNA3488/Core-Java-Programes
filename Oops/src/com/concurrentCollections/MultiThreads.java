package com.concurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThreads extends Thread {
	static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Dote");
	}

	public static void main(String[] args) throws InterruptedException {
		MultiThreads mt = new MultiThreads();
		mt.start();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			Thread.sleep(1000);
			String course = iterator.next();
			System.out.println(course);

		}

		System.out.println(courses);
	}

	
}
