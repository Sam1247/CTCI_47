import java.util.ArrayList;

class Solution {
	ArrayList<Integer> arrayList = new ArrayList<>();
	public int getMinimumDifference(TreeNode root) {
		inorder(root);
		int min = arrayList.get(1)-arrayList.get(0);
		for (int i = 1; i < arrayList.size()-1; ++i) {
			if ((arrayList.get(i+1)-arrayList.get(i)) < min) {
				min = (arrayList.get(i+1)-arrayList.get(i));
			}
		}
		return min;
	}

	void inorder (TreeNode root) {
		if (root != null) {
			inorder(root.left);
			arrayList.add(root.val);
			inorder(root.right);
		}
	}
}