class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        boolean isBuy=true;
        int K=3;
        int[][][] state=new int[n][K][2];
        for(int[][] darray:state){
            for(int[] array:darray){
                Arrays.fill(array,-1);
            }
        }
        return find(prices,0,K-1,isBuy,state);
        
    }
    
    private int find(int[] prices,int index,int K,boolean isBuy,int[][][] state){
        if(index>=prices.length || K<=0) return 0;
       
        if(state[index][K][isBuy ? 1 : 0]!=-1) return state[index][K][isBuy ? 1 :0];
        
        if(isBuy){
            
            return state[index][K][isBuy ? 1: 0 ]=Math.max(find(prices,index+1,K,isBuy,state),-prices[index]+find(prices,index+1,K,!isBuy,state));
            
        }
        else{
            
            return state[index][K][isBuy ? 1: 0]=Math.max(find(prices,index+1,K,isBuy,state),prices[index]+find(prices,index+1,K-1,!isBuy,state));
        }
        
        
    }
    
}