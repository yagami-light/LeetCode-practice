class Solution {
    int[] unionSet;
    boolean[] hasEdgeO;
    
    
    public void solve(char[][] board) {
        
        if(board.length==0 || board[0].length==0) return;
        
        int height=board.length;
        int width=board[0].length;
        
        unionSet=new int[height*width];
        hasEdgeO=new boolean[unionSet.length];
        
        for(int i=0;i<unionSet.length;i++) unionSet[i]=i;
        
        for(int i=0;i<hasEdgeO.length;i++){
            
            int x=i/width, y=i%width;
            hasEdgeO[i]=(board[x][y]=='O') && (x==0 || x==height-1 || y==0 || y==width-1);
        }
        
        
        for(int i=0;i<unionSet.length;i++){
            
             int x=i/width, y=i%width,up=x-1,right=y+1;
            if(up>=0 && board[x][y]==board[up][y]) union(i,i-width);
            if(right<width && board[x][y]==board[x][right]) union(i,i+1);
            
        }
        
        for(int i=0;i<unionSet.length;i++){
            
             int x=i/width, y=i%width;
            if(board[x][y]=='O' && !hasEdgeO[find(i)])
                board[x][y]='X';
            
        }
        
        
    }
    
    private void union(int x, int y){
        int rootX=find(x);
        int rootY=find(y);
        
        boolean hasEdge=this.hasEdgeO[rootX] || this.hasEdgeO[rootY];
        unionSet[rootX]=rootY;
        hasEdgeO[rootY]=hasEdge;
    }
    
    private int find(int x){
        if(unionSet[x]==x) return x;
        unionSet[x]=find(unionSet[x]);
        return unionSet[x];
        
    }
    
    
    
}