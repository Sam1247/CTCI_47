import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean hasCycle(ListNode head) {

		Set<ListNode> hash = new HashSet<>();
		while (head != null) {
			if (hash.contains(head)) {
				return true;
			} else {
				hash.add(head);
				head = head.next;
			}
		}
		return false;
	}
}