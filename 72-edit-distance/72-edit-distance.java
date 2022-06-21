class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.length()==0 && word2.length()==0)
            return 0;
        if(word1.length()==0)
            return word2.length();
        if(word2.length()==0)
            return word1.length();
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        
        
        for(int i=0;i<=m;i++){
            
            
            for(int j=0;j<=n;j++){
                
                if(i==0 && j==0)
                    dp[i][j]=0;
                else if(i==0)
                    dp[i][j]=j;
                else if(j==0)
                    dp[i][j]=i;
                else{
                    
                    dp[i][j]=1+Math.min(dp[i-1][j-1] ,Math.min(dp[i-1][j] , dp[i][j-1]));
                    if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j-1]);
                    
                    
                }
                
            }
            
        }
        
        return dp[m][n];
        
        
        
    }
}