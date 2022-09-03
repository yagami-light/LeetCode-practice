class Solution {
    private static int[][] DIR=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        char[] input=word.toCharArray();
        
        // int m=board.length;
        // int n=board[0].length;
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(exist(board,input,i,j,0)){
                    return true;
                }
                
                
            }
            
        }
        
        return false;
        
    }
    
    private boolean exist(char[][] board,char[] input,int i,int j,int index){
        int m=board.length;
        int n=board[0].length;
         if(index>=input.length) return true;
        if( i<0 || j<0 || i>=m || j>=n || board[i][j]=='#') return false;
       
        char ch=board[i][j];
        // System.out.println("i :"+i+" j :"+j+" index :"+index);
        board[i][j]='#';
        
        for(int[] dir:DIR){
            
            if(ch==input[index] && exist(board,input,i+dir[0],j+dir[1],index+1))
                return true;
            
        }
        
        board[i][j]=ch;
        return false;
        
    }
}