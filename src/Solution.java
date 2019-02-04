import java.util.HashSet;
import java.util.Set;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;
		Set<ListNode> hash = new HashSet<>();
		ListNode current1 = headA;
		ListNode current2 = headB;
		while (current1 != null) {
			hash.add(current1);
			current1 = current1.next;
		}
		while (current2 != null) {
			if (hash.contains(current2)) {
				return current2;
			}
			current2 = current2.next;
		}
		return null;
	}
}