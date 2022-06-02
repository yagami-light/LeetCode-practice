class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        
        
        for(int i=0;i<m;i++){
            
            
            for(int j=0;j<n;j++){
                
                
                if(!isValid(board, i, j,m,n))
                    return false;
            }
            
        }
        return true;
        
        
    }

    
    private boolean isValid(char[][] board,int row,int col,int m,int n){
        char c=board[row][col];
        for(int i=0;i<m;i++){
            
            if(i!=row && board[i][col]!='.' && board[i][col]==c)
                return false;
            
             if(i!=col && board[row][i]!='.' && board[row][i]==c)
                return false;
            
            
            
            
             if((((3*(row/3)+i/3)))!=row && (((3*(col/3)+i%3))) != col && board[(((3*(row/3)+i/3)))][(((3*(col/3)+i%3)))]!='.' && board[(((3*(row/3)+i/3)))][(((3*(col/3)+i%3)))] ==c)
                return false;
            
            
            
            
            
        }
        return true;
        
        
    }
    
    
    
}