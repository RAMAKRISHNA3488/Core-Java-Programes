package com.Stack;

public class MyStack {
	Node1 head;
	int size;

	MyStack() {
		head = null;
		size = 0;
	}

	void push(int x) {
		Node1 temp = new Node1(x);
		temp.next = head;
		head = temp;
		size++;
	}
	int pop() {
		if(head==null) {
			return Integer.MAX_VALUE;
		}
		int res=head.data;
		Node1 temp=head;
		head=head.next;
		size--;
		return res;
	}
	int peek() {
		if(head==null) {
			return Integer.MAX_VALUE;
		}
		return head.data;
	}
	
	int size() {
		return size;
	}
	Boolean isEmpty() {
		return head==null;
	}

	public static void main(String[] args) {
		MyStack s=new MyStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.size);
	}
}
