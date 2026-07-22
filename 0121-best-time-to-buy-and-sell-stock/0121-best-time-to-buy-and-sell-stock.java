class Solution {
    public int maxProfit(int[] prices) {

        int maxP=0;
        int minBuy=prices[0];

        for(int i=1;i<prices.length;i++)
        {
            maxP=Math.max(maxP,prices[i]-minBuy);
            minBuy=Math.min(minBuy,prices[i]);
        }
        return maxP;
    }
}