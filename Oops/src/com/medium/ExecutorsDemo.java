package com.medium;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo {

	static Runnable runnableTask = () -> {
		try {
			System.out.println("Run method Called.");
			TimeUnit.MILLISECONDS.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	};

	public static void main(String[] args) {
		Executor executor = new ThreadPoolExecutor(1, 10, 0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());
		executor.execute(runnableTask);

	}

}
