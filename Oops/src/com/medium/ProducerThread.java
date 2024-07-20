package com.medium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import com.sun.tools.javac.Main;
import com.thread1.Mainthread;

public class ProducerThread implements Runnable {
	private List<String> buffer;
	private ReentrantLock bufferLock;
	private static final String EOF="EOF";

	public ProducerThread(List<String> buffer, ReentrantLock bufferLock) {
		super();
		this.buffer = buffer;
		this.bufferLock = bufferLock;
	}

	@Override
	public void run() {
		String num[] = { "1", "2", "3" };
		for (String number : num) {
			bufferLock.lock();
			try {
				buffer.add(number);
			} finally {
				bufferLock.lock();
			}
			try {
				Random random = new Random();
				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "Interruted.");
			}
			System.out.println(Thread.currentThread().getName() + "Added" + number);
		}
		System.out.println(Thread.currentThread().getName() + "Added");
		bufferLock.lock();

	}

}
