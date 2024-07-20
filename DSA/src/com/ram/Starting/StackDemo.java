package com.ram.Starting;

public class StackDemo {
	private int arr[];
	private int top;
	private int capacity;

	// Utility function to return the size of the stack
	public int size() {
		return top + 1;
	}

	// Empty stack
	public boolean isEmpty() {
		return top == -1;
	}

	// Stack is full
	public boolean isFull() {
		return top == capacity - 1;
	}

	public StackDemo(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;

	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("OverFlow Program Terminated");
			System.exit(1);

		}
		System.out.println("Inserting: " + x);
		arr[++top] = x;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return arr[top--];
	}

	public void Print() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		StackDemo stack = new StackDemo(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.Print();

		System.out.println("After Pop: ");
		stack.pop();
		stack.Print();

	}

}
