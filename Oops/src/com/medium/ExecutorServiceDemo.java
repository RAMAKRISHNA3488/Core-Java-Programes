package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
	public static void main(String[] args) {

		// ExecutorService using ThreadPoolExecutor implementation of executor service
		ExecutorService es = new ThreadPoolExecutor(1, 5, 0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());

		/*
		 * Create callable tasks using lambda implementation of call method of callable
		 * interface
		 */
		Callable<String> callableTask = () -> {
			System.out.println("call method called.");
			TimeUnit.MILLISECONDS.sleep(2000);
			return "Task execution in call method ";
		};

		/*
		 * submit single callable task to executorService, that is returning a feature
		 */
		Future<String> future = es.submit(callableTask);
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		// create list for callable tasks
		List<Callable<String>> list = new ArrayList<>();
		list.add(callableTask);
		list.add(callableTask);
		list.add(callableTask);
		list.add(callableTask);

		try {
			String result = es.invokeAny(list);
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		try {
			List<Future<String>> listFuture = es.invokeAll(list);
			es.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
