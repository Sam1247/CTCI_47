class Solution {
	public boolean isPalindrome(ListNode head) {
		if (head == null) return true;
		ListNode current = head;
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == null) break;
		}
		ListNode reverse = reverseList(slow);
		while (reverse != null) {
			if (reverse.val != current.val) {
				return false;
			}
			reverse = reverse.next;
			current = current.next;
		}
		return true;
	}
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;
	}
}
