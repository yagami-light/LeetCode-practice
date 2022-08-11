class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        
        int[][] state=new int[n][2];
        for(int[] array:state){
            Arrays.fill(array,-1);
        }
        int index=0,k=1;
        boolean isBuy=true;
        return find(prices,index,k,isBuy,state);
    }
    
    private int find(int[] prices,int index,int k,boolean isBuy,int[][] state){
        if(index>=prices.length) return 0;
        if(state[index][isBuy ? 1 : 0] != -1) return state[index][isBuy ? 1 : 0];
        
        if(isBuy){
            
            return state[index][isBuy ? 1 : 0]=Math.max(find(prices,index+1,k,isBuy,state),find(prices,index+1,k,!isBuy,state)-prices[index]);
            
        }else{
            
            return state[index][isBuy? 1: 0 ]=Math.max(find(prices,index+1,k,isBuy,state),find(prices,index+1,k,!isBuy,state)+prices[index]);
            
        }
        
        
    }
    
}