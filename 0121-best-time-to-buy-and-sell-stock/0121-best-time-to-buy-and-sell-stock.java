class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit=0;
        int size=prices.length;
        int currMax=0;
        for(int i=size-1;i>=0;i--){
            
            currMax=Math.max(currMax,prices[i]);
            int profit=currMax-prices[i];
            maxProfit=Math.max(maxProfit,profit);
            
        }
        
        return maxProfit;
        
    }
}