class Solution {
    public boolean divisorGame(int n) {
        
//         if(n==1)
//             return false;
        
//         if(n==2)
//             return true;
        
//         return divisorGame(n-2);
        
        boolean[] dp=new boolean[n+1];
        for(int i=0;i<=n;i++){
            
            if(i==1 || i==0)
                dp[i]=false;
            else if(i==2)
                dp[i]=true;
            else
            dp[i]=dp[i-2];
            
            
        }
        
        return dp[n];
        
        
        
        
    }
}