class Solution {
    public int maxProfit(int[] prices) {
        
        return maxProfitUtil(prices);
    }
    
    
    
    private int maxProfitUtil(int[] p){
        int maxValue=Integer.MIN_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        int n=p.length;
        
        for(int i=n-1;i>=0;i--){
            maxValue=Math.max(maxValue,p[i]);
            maxProfit=Math.max(maxProfit,maxValue-p[i]);
        }
        
        
        return maxProfit;
        
    }
}