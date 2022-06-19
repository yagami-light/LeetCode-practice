class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[m-1][n-1]==1) return 0;
        grid[m-1][n-1]=1;
        // int[] dp=new int[n];
        for(int i=m-1;i>=0;i--){
         
            
            
            for(int j=n-1;j>=0;j--){
                
                // newRow[j] =newRow[j+1]+dp[j]; 
                if(i==m-1 && j==n-1) continue;
                if(grid[i][j]==1) grid[i][j]=0;
                else{
                
                grid[i][j]=((i==m-1) ? 0 : grid[i+1][j] )+ ((j==n-1) ? 0 : grid[i][j+1]);
                    
                }
                
                
            }
            
        
            
            
        }
        
        return grid[0][0];
        
        
    }
}