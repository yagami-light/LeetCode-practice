class Solution {
    public int maxProfit(int[] prices) {
        
        int size=prices.length;
        int transactionSize=1;
        boolean isBuy=true;
        int[][] state=new int[size][2];
        for(int[] arr:state){
            Arrays.fill(arr,-1);
        }
        int index=0;
        
        return helper(prices,index,isBuy,state,transactionSize);
        
    }
    
    int helper(int[] prices,int index,boolean isBuy,int[][] state,int transactionSize){
        if(transactionSize==0 || index>=prices.length)
            return 0;
        
        if(state[index][isBuy?0:1]!=-1)
            return state[index][isBuy?0:1];
        
        if(isBuy){
            
            return state[index][isBuy?0:1]=Math.max(
                helper(prices,index+1,isBuy,state,transactionSize)
                ,-prices[index]+helper(prices,index+1,!isBuy,state,transactionSize)
            
            );
        }else{
            
            return state[index][isBuy?0:1]=Math.max(
                helper(prices,index+1,isBuy,state,transactionSize)
                ,prices[index]+helper(prices,index+1,!isBuy,state,transactionSize-1)
            );
                                            
        }
        
        
        
    }
    
}