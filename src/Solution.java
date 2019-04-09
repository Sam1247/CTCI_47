import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

	Queue<Node> q = new LinkedList<>();


	List<List<Integer>> lists = new LinkedList<>();

	public List<List<Integer>> levelOrder(Node root) {
		if (root == null) {
			return new LinkedList<>();
		}
		q.add(root);
		List<Integer> list1 = new LinkedList();
		list1.add(root.val);
		lists.add(list1);
		int temp = 1;

		while (!q.isEmpty()) {
			Node s = q.poll();
			temp--;
			for (Node node: s.children) {
				q.add(node);
			}

			if (temp == 0 && !q.isEmpty()) {
				List<Integer> list = new LinkedList();
				for (Node node: q) {
					list.add(node.val);
				}
				lists.add(list);
				temp = q.size();
			}
		}
		return lists;
	}
}