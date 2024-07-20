package com.medium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerThread implements Runnable {
	private List<String> buffer;
	private ReentrantLock bufferLock;
	private static final String EOF = "EOF";

	public ConsumerThread(List<String> buffer, ReentrantLock bufferLock) {
		super();
		this.buffer = buffer;
		this.bufferLock = bufferLock;
	}

	@Override
	public void run() {
		while (true) {
			bufferLock.lock();
			try {
				if (buffer.isEmpty()) {
					continue;
				}
				if (buffer.get(0) != null) {
					System.out.println(Thread.currentThread().getName() + "exiting");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "removed" + buffer.remove(0));
					try {
						Random random = new Random();
						Thread.sleep(random.nextInt(2000));
					} catch (InterruptedException e) {
						System.out.println(Thread.currentThread().getName() + "Interruted.");

					}
				}
			} finally {
				bufferLock.lock();
			}

		}
	}

}
