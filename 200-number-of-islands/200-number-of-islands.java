class Solution {
    private static int[][] DIRECTIONS=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(grid[i][j]=='1'){
                    count+=dfs(grid,i,j);

                }
                
                
            }
        }
        
        return count;
        
        
    }
    
    
    private int dfs(char[][] grid,int i, int j ){
        int m=grid.length;
        int n=grid[0].length;
        
        if(i<0 || j<0 || i>=m || j >=n || grid[i][j]=='0'){
            return 0;
        }
        
        grid[i][j]='0';
       
        for(int[] dir: DIRECTIONS){
            
            dfs(grid,i+dir[0],j+dir[1]);
        }
        
        
        return 1;
    }
    
    
}