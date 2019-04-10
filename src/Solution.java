import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	List<List<Integer>> lists;
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		lists = new ArrayList<>();
		traversal (root, 0);
		Collections.reverse(lists);
		return lists;
	}

	void traversal (TreeNode root, int level) {
		if (root == null) return;
		if (lists.size() < level) {
			lists.add(new ArrayList<>());
		}
		traversal(root.left, level+1);
		traversal(root.right, level+1);
		lists.get(level).add(root.val);
	}
}