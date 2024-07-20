package com.framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuturDemo {
	public static void main(String[] args) {
		MyCallable[] callables = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60), new MyCallable(70), new MyCallable(80), new MyCallable(90),
				new MyCallable(100), new MyCallable(110) };
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (MyCallable myCallable : callables) {
			// Future<Integer> future = service.submit(myCallable);
			Future<Integer> future = service.submit(myCallable);

			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}
