class Solution {
	int len = 0;
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		DFS(root, 1);
		return len;
	}

	void DFS (TreeNode root, int dep) {
		if (root == null) return;
		if (len < dep) len = dep;
		DFS(root.left, dep+1);
		DFS(root.right, dep+1);
	}
}