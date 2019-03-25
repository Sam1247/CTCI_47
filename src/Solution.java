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
//class Solution {
//	private int minv = Integer.MAX_VALUE;
//	private Integer prev = null;
//	public int getMinimumDifference(TreeNode root) {
//		if(root == null) return minv;
//		getMinimumDifference(root.left);
//		if(prev != null){
//			minv = Math.min(root.val - prev, minv);
//		}
//		prev = root.val;
//		getMinimumDifference(root.right);
//		return minv;
//	}
//}