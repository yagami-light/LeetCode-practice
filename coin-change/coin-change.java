class Solution {
    public int coinChange(int[] coins, int amount) {
        
       int  cache[]=new int[amount+1];
        return coinChangeUtil(coins,amount,cache);
    }
    
    
    
    private int coinChangeUtil(int[] coins,int amount,int[] cache){
        if(amount<0)
            return -1;
        if(amount==0)
            return 0;
        if(cache[amount]!=0)
            return cache[amount];
        
        int min=Integer.MAX_VALUE;
        for(int coin:coins){
            
            int res=coinChangeUtil(coins,amount-coin,cache);
            if(res>=0 && res<min)
                min=res+1;
            
        }
        
        
        int computedValue=(min==Integer.MAX_VALUE) ? -1 : min;
        cache[amount]=computedValue;
        return cache[amount];
        
    }
}