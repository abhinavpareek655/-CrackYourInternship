class MaxProfit {
    public int maxProfit(int[] prices) {
        int max=0;
        int curr=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(curr<prices[i])
            {
                max=Math.max(max,prices[i]-curr);
            }
            else
            {
                curr=prices[i];
            }
        }
        return max;
    }
}
