class Solution {
	public int maxProfit(int[] prices) {
		int sum = 0;
		int i = 0;
		int j = 1;
		while (j < prices.length) {
			//
			if (prices[i] > prices[j]) {
				i = j;
				j++;
			} else {
				while (j < prices.length && prices[j-1] < prices[j]) {
					j++;
				}
				sum += prices[j-1] - prices[i];
				i = j;
				j++;
			}
		}
		return sum;
	}
}