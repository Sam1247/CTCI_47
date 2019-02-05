public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;
		int l1 = 0, l2 = 0;
		ListNode current1 = headA;
		ListNode current2 = headB;
		while (current1 != null) {
			l1++;
			current1 = current1.next;
		}
		while (current2 != null) {
			l2++;
			current2 = current2.next;
		}
		current1 = headA;
		current2 = headB;
		if (l1 > l2) {
			for (int i = 0; i <(l1-l2); ++i) {
				current1 = current1.next;
			}
		} else {
			for (int i = 0; i <(l2-l1); ++i) {
				current2 = current2.next;
			}
		}
		while (current1 != null) {
			if (current1 == current2) return current1;
			current1 = current1.next;
			current2 = current2.next;
		}
		return null;
	}
}