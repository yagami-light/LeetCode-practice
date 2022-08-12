class Solution {
    public int numIslands(char[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        Set<String> set=new HashSet();
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,set);
                    count++;
                }
                
            }
            
        }
        return count;
        
        
    }
    
    private void dfs(char[][] grid,int i,int j,Set<String> set){
        int m=grid.length;
        int n=grid[0].length;
        
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='0') return;
        
        // set.add(i+"@"+j);
        grid[i][j]='0';
        
        dfs(grid,i+1,j,set);
        dfs(grid,i,j+1,set);
        dfs(grid,i-1,j,set);
        dfs(grid,i,j-1,set);
        
    }
    
    
}

/*
[
["1","1","0","0","0"],
["1","1","0","0","0"],
["0","0","1","0","0"],
["0","0","0","1","1"]]




*/
