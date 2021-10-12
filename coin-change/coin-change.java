class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] cache=new int[amount+1];
        return coinChangeUtil(coins,amount,0,cache);
    }
    
    
    
    private int coinChangeUtil(int[] coins,int amount,int index,int[] cache){
      
        if(amount<0)
            return -1;
        if(amount==0)
            return 0;
          if(cache[amount]!=0)
            return cache[amount];
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int taken=coinChangeUtil(coins,amount-coins[i],i,cache);
            if(taken >=0 && taken<min){
                min=1+taken;
            }
            
            
            
        }
        
        
        int computedValue= (min==Integer.MAX_VALUE) ? -1 : min;
        cache[amount]=computedValue;
        return cache[amount];
        
    }
    
    
    
}