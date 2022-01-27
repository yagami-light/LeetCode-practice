class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int  n =cost.length; 
       int[] dp=new int[n+1];
       dp[n]=0;
       dp[n-1]=cost[n-1];
        
       for(int i=n-2;i>=0;i--){
           
           dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
           
           
           
       } 
        
        return Math.min(dp[0],dp[1]);
        
        
        
        
        
    }
    
    
    private int minCostClimbingStairsRec(int[] cost){
         int dp[]=new int[cost.length];
        
      
        
        return Math.min(minCostClimbingStairsUtil(cost,0,0),minCostClimbingStairsUtil(cost,1,0));
        
    }
    
    
    
    private int minCostClimbingStairsUtil(int[] cost,int index,int currCost){
      if(index>cost.length-1)
          return 0;
        
        int skip=minCostClimbingStairsUtil(cost,index+2,currCost);
        int notSkip=minCostClimbingStairsUtil(cost,index+1,currCost+cost[index]);
        
        return cost[index]+Math.min(skip,notSkip);
        
        
    }
    
}