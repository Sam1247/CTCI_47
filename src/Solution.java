import java.util.LinkedList;
import java.util.List;

class Solution {

	List<List<Integer>> lists;

	public List<List<Integer>> levelOrder(Node root) {
		lists = new LinkedList<>();
		handler(root, 0);
		return lists;
	}

	public void handler (Node root, int level) {
		if (root == null) return;
		if (level >= lists.size()) lists.add(new LinkedList<>());
		lists.get(level).add(root.val);
		for (Node node: root.children) {
			handler(node, level+1);
		}
	}
}