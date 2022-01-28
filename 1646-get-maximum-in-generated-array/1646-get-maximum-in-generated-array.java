class Solution {
    public int getMaximumGenerated(int n) {
        int max=Integer.MIN_VALUE;
        
        int[] dp=new int[n+1];
        
        for(int i=0;(i)<=n;i++){
            if(i<2)
                dp[i]=i;
             else if(i%2==0)
                dp[i]=dp[i/2];
            
             else 
                 // dp[2*i+1]=dp[i]+dp[i+1];
                dp[i]=dp[i/2+1]+dp[i/2];
            
            // System.out.println("index "+i+ " value "+dp[i]);
            max=Math.max(max,dp[i]);
                
            
            
        }
        
        return max;
        
        
        
        
    }
}