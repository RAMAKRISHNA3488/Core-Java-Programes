package com.ram.LinkedList;

public class CircularLinkedList {
	// represent node of list
	public class Node {
		int date;
		Node next;

		public Node(int data) {
			this.date = data;
		}

	}
	// declare head and tail pointer as null

	public Node head = null;
	public Node tail = null;

	// this function is add new node at end of this list

	public void add(int data) {
		// create the new node

		Node newNode = new Node(data);
		// check is the list is empty
		if (head == null) {
			// it the list is empty,both head and tail would point to new node
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			// tail will point to new node
			tail.next = newNode;
			// new node will become new tail
			tail = newNode;
			// since,it is circular linked list tail will point to head
			tail.next = head;
		}
	}

	// Display all the node in the list
	public void display() {
		Node corrent = head;
		if (head == null) {
			System.out.println("List is Empty.");
		} else {
			System.out.println("Node of the circular Linked list: ");
			do {
				// prints each node by incrementing pointer
				System.out.println(" " + corrent.date);
				corrent = corrent.next;
			} while (corrent != head);
			System.out.println();
		}
	}

	
	public void reverse() {
		
	}
	public static void main(String[] args) {
		CircularLinkedList c=new CircularLinkedList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		c.display();
		

	}
}
