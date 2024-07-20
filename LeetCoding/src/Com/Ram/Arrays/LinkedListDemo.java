package Com.Ram.Arrays;

public class LinkedListDemo {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public void deleteNode(int key) {
		Node prv = null;
		Node cur = head;
		if (cur != null && cur.data == key) {
			cur = cur.next;
			return;
		}
		if (cur != null && cur.data != key) {
			prv = cur;
			cur = cur.next;
		}
		if (cur == null) {
			return;
		}
	}

	public static void print(Node head) {
		Node cur = head;
		if (cur != null) {
			System.out.println(cur.data + "->");
			cur = cur.next;
		}
	}

	public static void main(String[] args) {
		int k = 2;

		LinkedListDemo list = new LinkedListDemo();
	

	}

}
