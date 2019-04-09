import java.util.ArrayList;

class Solution {
	ArrayList<Integer> leaves1;
	ArrayList<Integer> leaves2;
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {

		if (root1 == null || root2 == null) return false;

		leaves1 = new ArrayList<>();
		leaves2 = new ArrayList<>();

		treeTraversal(root1, leaves1);
		treeTraversal(root2, leaves2);

		return leaves1.equals(leaves2);
	}

	void treeTraversal (TreeNode root, ArrayList arrayList) {
		if (root == null) return;
		treeTraversal(root.left, arrayList);
		if (root.left == null && root.right == null) {
			arrayList.add(root.val);
		}
		treeTraversal(root.right, arrayList);
	}
}