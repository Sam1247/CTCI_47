public class Main {
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.right = new TreeNode(3);
		treeNode.right.left = new TreeNode(2);
		Solution solution = new Solution();
		System.out.println(solution.getMinimumDifference(treeNode));
	}


}
