class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int[][] state=new int[n][2];
        for(int[] arr:state){
            Arrays.fill(arr,-1);
        }
        boolean isBuy=true;
        int index=0;
        int k=1;
        return helper(prices,index,state,isBuy,k);
        
        
    }
    
    int helper(int[] prices,int index,int[][] state,boolean isBuy,int k){
        if(k==0 || index >=prices.length) return 0;
        if(state[index][isBuy?0:1]!=-1) return state[index][isBuy?0:1];
        if(isBuy){
            return state[index][isBuy?0:1]=Math.max(helper(prices,index+1,state,isBuy,k),-prices[index]+helper(prices,index+1,state,!isBuy,k));
        }else{
            return state[index][isBuy?0:1]=Math.max(helper(prices,index+1,state,isBuy,k),prices[index]+helper(prices,index+1,state,!isBuy,k-1));
        }
        
    }
    
}