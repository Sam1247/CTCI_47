class Solution {
	int sum = 0;
	public int rangeSumBST(TreeNode root, int L, int R) {
		if (root != null) {
			rangeSumBST(root.left, L, R);
			if (root.val >= L && root.val <= R) {
				sum += root.val;
			}
			rangeSumBST(root.right, L, R);
		}
		return sum;
	}
}