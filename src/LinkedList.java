class Node {
	Node next = null;
	int data;

	Node(int data) {
		this.data = data;
	}
}

public class LinkedList {
	Node head;

	// append to last
	public void append(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node current = this.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
	}

	// append at first
	public void preappend(int data) {
		Node current = new Node(data);
		current.next = head;
		head = current;
	}

	// delete with value
	public void deleteWithValue(int data) {

		if (head == null) return;

		if (head.data == data) {
			head = head.next;
		}

		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	// print linked list
	public void printLinkedList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	// print kth element from last "recursive"
	public int printKthToLast(Node head, int k) {
		if (head == null) {
			return 0;
		}
		int index = printKthToLast(head.next, k) + 1;
		if (index == k) {
			System.out.println(head.data);
		}
		return index;
	}


	// return the kth node from last element "recursive"
	// using wrapper class
	class Index {
		public int value = 0;
	}

	public Node kthToLastRec(Node head, int k) {
		Index idx = new Index();
		return kthToLast(head, k, idx);
	}

	private Node kthToLast(Node head, int k, Index idx) {
		if (head == null) {
			return null;
		}
		Node node = kthToLast(head.next, k, idx);
		idx.value += 1;
		if (idx.value == k) {
			return head;
		}
		return node;
	}

	// return the kth node from last element "Iterative"
	//o(n) time o(1) space
	// runner approach
	public Node kthToLastItr(Node head, int k) {
		Node p1 = head;
		Node p2 = head;
		for (int i = 0; i < k; i++) {
			if (p1 == null) return null;
			p1 = p1.next;
		}
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	// 2.3 Delete Middle Node nice problem


}