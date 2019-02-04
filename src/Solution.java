import java.util.ArrayList;

class Solution {
	public boolean isPalindrome(ListNode head) {
		ArrayList<ListNode> arr = new ArrayList<>();
		ListNode current = head;
		while (current != null) {
			arr.add(current);
			current = current.next;
		}
		for (int i = 0; i < arr.size()/2; ++i) {
			if (arr.get(i).val != arr.get(arr.size() - 1 - i).val) {
				return false;
			}
		}
		return true;
	}
}
