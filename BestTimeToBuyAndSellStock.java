package com.company.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
        int ans = 0;
        int a = 0;
        int b = 1;
        while (b < prices.length ) {
            if(prices[a]<prices[b])
                ans = Math.max(ans, prices[b]-prices[a]);
            else a=b;
            b++;
        }
        return ans;
    }
}
