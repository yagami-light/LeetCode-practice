class Solution {
    Map<String,Integer> cache=new HashMap();
    public int uniquePathsWithObstacles(int[][] grid) {
        
        return uniquePathsWithObstacles(grid,0,0);
        
    }
    
    
    private int uniquePathsWithObstacles(int[][]  grid,int i,int j){
        
        if(i<0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j]==1){
            return 0;
        }
        if(i==grid.length-1 && j == grid[0].length-1){
            return 1;
        }
        String key=i+"@"+j;
        if(cache.get(key)!=null)
            return cache.get(key);
         cache.put(key,uniquePathsWithObstacles(grid,i+1,j) + uniquePathsWithObstacles(grid,i,j+1));
        return cache.get(key);
        
        
        
    }
    
}