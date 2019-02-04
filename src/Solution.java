class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		while (head.val == val) {
			head = head.next;
			if (head == null) {
				return null;
			}
		}
		ListNode current = head;
		while (current.next != null) {
			if (current.next.val == val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
}
