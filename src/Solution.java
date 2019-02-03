class Solution {
	// Iterative sol
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode p1 = null;
		ListNode p2 = head;
		ListNode p3 = head.next;
		while (p3 != null) {
			p2.next = p1;
			if (p3 == null) {
				break;
			}
			p1 = p2;
			p2 = p3;
			p3 = p3.next;
		}
		return p2;
	}
}