class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] dp=new int[n];
        int min=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            min=Math.min(min,prices[i]);
            dp[i]=min;
            max=Math.max(max,prices[i]-min);
            
        }
        
        
        return max;
        
        
    }
}