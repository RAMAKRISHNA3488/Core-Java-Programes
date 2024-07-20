package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> e=new PriorityQueue<>();
		System.out.println(e.peek());
		//System.out.println(e.element());
		
		for(int i=20;i<=30;i++) {
			e.offer(i);
			
		}
		System.out.println(e);
		System.out.println(e.poll());
		System.out.println(e.remove());
		System.out.println(e);
		e.add(45);
		e.add(55);
		System.out.println(e);
		e.add(900);
		System.out.println(e);

	}

}
