class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int cache[]=new int[100001];
        return coinChangeUtil(coins, amount,cache);
    }
    
    
    private int coinChangeUtil(int[] coins, int amount,int[] cache){
        if(amount==0)
            return 0;
        if(amount <0)
            return -1;
        
        if(cache[amount]!=0)
            return cache[amount];
        int min=Integer.MAX_VALUE;
        
        for(int  coin:coins){
          
            int totalCoin=coinChangeUtil(coins,amount-coin,cache);
             if(totalCoin< min && totalCoin >=0){
            min=1+totalCoin;
        }
        }
        
            
            
            cache[amount]=(min==Integer.MAX_VALUE ? -1 : min);
            return cache[amount];           
            
        }
        
      
        
    
    
    
}