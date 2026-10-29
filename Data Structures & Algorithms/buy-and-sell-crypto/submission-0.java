class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i=0;i<prices.length;i++){
            int curPrice = prices[i];
            int profit = curPrice - minPrice;

            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, curPrice); 
        }
        return maxProfit;
    }
}
