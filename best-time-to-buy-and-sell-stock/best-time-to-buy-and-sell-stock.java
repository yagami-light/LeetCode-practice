class Solution {
    public int maxProfit(int[] prices) {
    
        return maxProfit2(prices);
    }
    
    
    private int maxProfit1(int[] prices){
            int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            
            for(int j=i+1;j<prices.length;j++){
                
                maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
            }
            
        }
        
        return maxProfit;
        
    }
    
    
    private int maxProfit2(int[] prices){
        int n=prices.length;
        int max=0;
        int maxProfit=0;
        for(int i=n-1;i>=0;i--){
            
            max=Math.max(max,prices[i]);
            maxProfit=Math.max(maxProfit,max-prices[i]);
            
            
        }
        
        return maxProfit;
    }
    
}