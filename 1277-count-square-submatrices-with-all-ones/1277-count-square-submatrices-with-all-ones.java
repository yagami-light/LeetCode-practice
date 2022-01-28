class Solution {
    public int countSquares(int[][] mat) {
        
        int m=mat.length;
        int n=mat[0].length;
        int count=0;
        
        int[][] dp=new int[m][n];
        
        for(int i=0;i<m;i++){
            
           
            for(int j=0;j<n;j++){
                 if(i==0)
                    dp[i][j]=mat[i][j];
            
                else if(j==0)
                    dp[i][j]=mat[i][j];
                else
                    dp[i][j]=mat[i][j]==1 ? (1+(Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]))) : 0;
                
                count+=dp[i][j];
                
                
                
            }
        }
        
        
        
        return count;
        
        
        
    }
    
  
    
}