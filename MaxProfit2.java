class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int ans = 0;
        for (int p: prices) {
            if (p > price) {
                ans += p - price;
                price = p;
            } else {
                price = p;
            }
        } 
        return ans;
    }
}
