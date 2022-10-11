class Solution {
    int[][] DIR=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> queue=new LinkedList();
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(grid[i][j]==2){
                    
                    queue.add(new int[]{i,j});
                    
                }
                
                if(grid[i][j]==1){
                    fresh++;
                }
                
            }
            
            
        }
        if(fresh==0) return 0;
        System.out.println("queue :"+queue);
        
        int count=0;
        Set<String> set=new HashSet();
        while(!queue.isEmpty()){
            
            int size=queue.size();
         
            
            for(int i=0;i<size;i++){
                
                int[] node=queue.remove();
                if(grid[node[0]][node[1]]==1)
                fresh--;
                
                
                for(int[] dir:DIR){
                    
                    int x=node[0] + dir[0];
                    int y=node[1] + dir[1];
                    
                    if(x<0 || y < 0 || x >=m || y >=n || grid[x][y] !=1) continue;
                    System.out.println("adding :"+x+" "+y);
                    String key=x+"@"+y;
                    if(set.contains(key)) continue;
                    set.add(key);
                    queue.add(new int[]{x,y});
                    
                    
                    
                }
                 
                
                
                
                
                
            }
              count++;
            
            
        }
        System.out.println("fresh :"+fresh);
        if(fresh==0 )
            return count-1;
        else
            return -1;
        
        
        
        
    }
}