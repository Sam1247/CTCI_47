import java.util.ArrayList;

class Solution {
	ArrayList<Integer> arrayList;
	public boolean isValidBST(TreeNode root) {
		arrayList = new ArrayList<>();
		inOrder(root);
		for (int i = 1; i < arrayList.size(); i++) {
			if (arrayList.get(i) < arrayList.get(i-1)) {
				return false;
			}
		}
		return true;
	}

	void inOrder (TreeNode root) {
		if (root == null) return;
		inOrder(root.left);
		arrayList.add(root.val);
		inOrder(root.right);
	}

}