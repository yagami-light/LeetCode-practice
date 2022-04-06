class Solution {
    private static int[][] DIRECTIONS=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    
    
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            
            
            for(int j=0;j<n;j++){
                
                if(grid[i][j]=='1'){
                    count++;
                    grid[i][j]='0';
                    
                    Queue<int[]> queue=new LinkedList();
                    queue.add(new int[]{i,j});
                    while(!queue.isEmpty()){
                        
                        int[] node=queue.remove();
                        
                        for(int[] dir:DIRECTIONS){
                            
                            int x=node[0]+dir[0];
                            int y=node[1]+dir[1];
                            
                            if(x<0 || y < 0 || x>=m || y>=n || grid[x][y]=='0')
                                continue;
                            
                            if(grid[x][y]=='1'){
                                queue.add(new int[]{x,y});
                                grid[x][y]='0';
                            }
                            
                            
                        }
                        
                        
                    }
                    
                    
                }
                
                
            }
            
        }
        return count;
        
        
    }
}