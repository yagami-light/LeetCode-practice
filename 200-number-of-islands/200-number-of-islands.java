class Solution {
    final static int[][] DIRECTIONS=new int[][]{{1,0},{0,-1},{-1,0},{0,1}};
    public int numIslands(char[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        
        for(int i=0;i<m;i++){
            
            
            for(int j=0;j<n;j++){
                
                
                if(grid[i][j]=='1'){
                    
                    
                    count++;
                    Queue<int[]> queue=new LinkedList();
                    queue.add(new int[]{i,j});
                    grid[i][j]='0';
                    while(!queue.isEmpty()){
                        
                        int[] pop=queue.remove();
                        
                        for(int[] dir:DIRECTIONS){
                            int x=pop[0]+dir[0];
                            int y=pop[1]+dir[1];
                            
                            if(x<0 || y< 0 || x>=m || y >=n || grid[x][y]=='0')
                                continue;
                            if(grid[x][y]=='1'){
                            grid[x][y]='0';

                            queue.add(new int[]{x,y});
                            }
                            
                            
                        }
                        
                        
                        
                    }
                    
                    
                    
                    
                    
                    
                    
                }
                
                
                
                
                
            }
            
            
        }
        
        return count;
        
        
        
        
    }
}