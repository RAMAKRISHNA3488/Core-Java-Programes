package com.concurrentCollections1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		OrderProducer orderProducer = new OrderProducer(queue);
		OrderConsumer orderConsumer = new OrderConsumer(queue);
		new Thread(orderConsumer).start();
		new Thread(orderProducer).start();
	}

}
