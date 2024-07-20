package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MainPoducterAndConsumer {
	private static final String EOF="EOF";

	public static void main(String[] args) {
		List<String> buffer = new ArrayList<>();
		ReentrantLock bufferLock = new ReentrantLock();
		Thread producerThread = new Thread(new ProducerThread(buffer, bufferLock));
		producerThread.setName("producerThread");
		Thread consumerThraed1=new Thread(new ConsumerThread(buffer, bufferLock));
		consumerThraed1.setName("consumerThread1");
		Thread consumerThraed2=new Thread(new ConsumerThread(buffer, bufferLock));
		consumerThraed1.setName("consumerThread2");
		
		producerThread.start();
		consumerThraed1.start();
		consumerThraed2.start();
	

	}

}
