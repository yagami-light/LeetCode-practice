class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int K=k+1;
        int n=prices.length;
        int[][][] state=new int[n][K][2];
        
        for(int[][] ddArray:state){
            
            for(int[] darray:ddArray){
                Arrays.fill(darray,-1);
            }
        }
        boolean isBuy=true;
        
        return find(prices,K-1,0,state,isBuy);   
    }
        
        private int find(int[] prices,int K,int index,int[][][] state,boolean isBuy){
            if(index>=prices.length || K<=0) return 0;
            
            if(state[index][K][isBuy ? 1: 0] !=-1) return state[index][K][isBuy ? 1 : 0];
            
            if(isBuy){
                
                return state[index][K][isBuy? 1 : 0]=Math.max(find(prices,K,index+1,state,isBuy),-prices[index]+find(prices,K,index+1,state,!isBuy));
            }
            else{
                return state[index][K][isBuy? 1 : 0]=Math.max(find(prices,K,index+1,state,isBuy),prices[index]+find(prices,K-1,index+1,state,!isBuy));
            }
            
        } 
        
        
    }
