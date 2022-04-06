class Solution {
    private static final int[][] DIRECTIONS=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {
        int m =grid.length;
        int n=grid[0].length;
        boolean[][] visisted=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            
            
            for(int j=0;j<n;j++){
                
                
                if(!visisted[i][j] && dfs(grid,i,j,visisted))
                    count++;
                
            }
            
        }
        
        return count;
        
    }
    
    
    
    private boolean dfs(char[][] grid,int i,int j,boolean[][] visisted){
        int m=grid.length;
        int n=grid[0].length;
        
        if(i<0 || j< 0 || i>= m || j>= n || visisted[i][j]|| grid[i][j]!='1')
            return false;
        boolean result=false;
        visisted[i][j]=true;
        
        for(int[] dir:DIRECTIONS){
            int x=i+dir[0];
            int y=j+dir[1];
            
            result|=dfs(grid,x,y,visisted);
            
        }
        
        
        return true|result;
        
        
    }
    
    
    
}