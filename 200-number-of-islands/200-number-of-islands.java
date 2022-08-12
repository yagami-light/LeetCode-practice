class Solution {
    public static final int[][] DIRECTIONS=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(grid[i][j]=='1'){
                    count++;
                       Queue<int[]> queue=new LinkedList();
                        grid[i][j]='0';
                        queue.add(new int[]{i,j});
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int k=0;k<size;k++){
                
                int[] node=queue.remove();
                // System.out.println("print node :" +Arrays.toString(node));
                
               for(int[] dir:DIRECTIONS){
                   
                   int ni=node[0]+dir[0];
                   int nj=node[1]+dir[1];
                   // System.out.println(" node i and j :"+ni+" "+nj);
                   
                   if(ni<0 || nj<0 || ni>=m || nj >=n || grid[ni][nj]=='0') {}
                   else{
                grid[ni][nj]='0';
                   queue.add(new int[]{ni,nj});
                   }
                   
               }
                    
                
            }
        }
                }
                
            }
        }
        
        return count;
    }
    
    void bfs(char[][] grid,int i,int j){
        
        // if(i<0 || j<0 || i>=m || j >=n || grid[i][j]=='0') return;
    
        
    }
    
}