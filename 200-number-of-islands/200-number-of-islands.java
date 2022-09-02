class Solution {
    
    public static final int[][] DIR=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    
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
                    
                    while(!queue.isEmpty()){
                        
                        int[] node=queue.remove();
                        grid[node[0]][node[1]]='0';
                        
                        for(int[] dir:DIR){
                            
                            int newX=node[0]+dir[0];
                            int newY=node[1]+dir[1];
                            if(newX<0 || newY <0 || newX >=m || newY >=n)  continue;
                            if(grid[newX][newY]=='1'){
                                grid[newX][newY]='0';
                            queue.add(new int[]{newX,newY});
                            }
                        }
                        
                    }
                    
                }
                
            }
            
            
        }
        return count;
        
    }
}