class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp=new int[k+2][n];
        for(int[] array:dp)
            Arrays.fill(array,Integer.MAX_VALUE);
        for(int i=0;i<dp.length;i++)
            dp[i][src]=0;
        
        
        for(int i=1;i<dp.length;i++){
            
            
            for(int[] flight:flights){
                int u=flight[0];
                int v=flight[1];
                int w=flight[2];
                
                if(dp[i-1][u]!=Integer.MAX_VALUE)
                dp[i][v]=Math.min(dp[i][v],dp[i-1][u]+w);
                
            }
            
        }
        
        return dp[k+1][dst]==Integer.MAX_VALUE ? -1 : dp[k+1][dst];
        
    }
}