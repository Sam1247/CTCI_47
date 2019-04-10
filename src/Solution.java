class Solution {
	public void rotate(int[] nums, int k) {
		int [] temp = new int[nums.length];
		for (int i = 0; i < nums.length; ++i) {
			int newIndx = (i+k)%nums.length;
			temp[newIndx] = nums[i];
		}
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = temp[i];
		}
	}
}