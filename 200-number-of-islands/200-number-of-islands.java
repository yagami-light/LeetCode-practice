class Solution {
    private static int[][] DIRECTIONS=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    
    class UnionFind{
        int[] parent;
        int[] rank;
        int[] size;
        int count;
        
        UnionFind(char[][] grid){
            int m=grid.length;
            int n=grid[0].length;
            
            parent=new int[m*n];
            rank=new int[m*n];
            size=new int[m*n];
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    
                    parent[i*n+j]=i*n+j;
                    if(grid[i][j]=='1')
                        count++;
                    size[i*n+j]=1;
                }
            }
            // System.out.println()
            
        }
        
        private int find(int x){
                                                // System.out.println("master");

            while(x != parent[x]){
x=parent[x];                
            }
            
            
            return x;
        }
        
        
        private void union(int x,int y){
                                                // System.out.println("x "+x+" y"+y);

            int px=find(x);
            int py=find(y);
            if(px!=py){
                count--;
                if(size[px]>=size[py]){
                    parent[py]=px;
                    size[px]+=size[py];
                }
                else{
                    parent[px]=py;
                    size[py]+=size[px];
                }
                
            }
            
            
        }
        
        
        
        
    }
    
    public int numIslands(char[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        UnionFind uf=new UnionFind(grid);
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                
                if(grid[i][j]=='1'){
                    
                    for(int[] dir: DIRECTIONS){
                        
                        int x=i+dir[0];
                        int y=j+dir[1];
                        
                        if(x<0 || y< 0|| x>=m || y >=n || grid[x][y]=='0')
                            continue;
                        if(grid[x][y]=='1')
                        uf.union(i*n+j,x*n+y);
                        
                        
                        
                        
                    }
                    
                }
                
                
            }
            
        }
        
        return uf.count;
        
        
        
        
    }
}