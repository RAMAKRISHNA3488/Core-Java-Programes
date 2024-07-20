package com.concurrentCollections1;

import java.util.concurrent.BlockingQueue;


public class OrderProducer implements Runnable{
	private BlockingQueue<String> queue;
	
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		try {
			queue.put("mac book pro");
			queue.put("HP laptop");
			queue.put("Iphone");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
