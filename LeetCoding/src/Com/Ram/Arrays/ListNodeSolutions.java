package Com.Ram.Arrays;

public class ListNodeSolutions {

	public ListNode reverseList(ListNode head) {
		ListNode prv = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prv;
			prv = curr;
			curr = nextNode;

		}
		return prv;
	}

	public void printList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " -> ");
			curr = curr.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		 ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        ListNodeSolutions reversal = new ListNodeSolutions();
	        System.out.println("Original List:");
	        reversal.printList(head);

	        ListNode reversedHead = reversal.reverseList(head);
	        System.out.println("Reversed List:");
	        reversal.printList(reversedHead);
	}

}
