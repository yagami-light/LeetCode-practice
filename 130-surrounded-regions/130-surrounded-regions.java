class Solution {
    public void solve(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        
        for(int i=0;i<row;i++){
            check(board,i,0,row,col);
            if(col>0)
                check(board,i,col-1,row,col);
        }
        
        for(int j=0;j<col;j++){
            check(board,0,j,row,col);
            if(row>0)
                check(board,row-1,j,row,col);
        }
        
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){
                
                if(board[i][j]!='X'){
                    if(board[i][j]=='1')
                        board[i][j]='O';
                    else
                        board[i][j]='X';
                    
                }
            }
            
        }
        
        
    }
    
    private void check(char[][] board,int i,int j,int row,int col){
        if(board[i][j]=='O'){
            board[i][j]='1';
            
            if(i>0)
                check(board,i-1,j,row,col);
            if(j>0)
                check(board,i,j-1,row,col);
            
            if(i<row-1)
                check(board,i+1,j,row,col);
            if(j<col-1)
                check(board,i,j+1,row,col);
            
        }
        
        
        
    }
    
}