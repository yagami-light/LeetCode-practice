class Solution {
    public void solveSudoku(char[][] board) {
    
        if(board==null|| board.length==1)
            return;
        
        helper(board);
    
    
    }
        
    


private boolean isvalid(char[][] b,int row,int col,char c){
    
    for(int i=0;i<9;i++){
        
        if(b[row][i]!='.' && b[row][i]==c)
            return false;
        
        if(b[i][col]!='.' && b[i][col]==c)
            return false;
        
        if(b[3*(row/3)+i/3][3*(col/3)+i/3]!='.' && b[3*(row/3)+i/3][3*(col/3)+i%3]==c)
            return false;
        
        
    }
    return true;
    
}

    
    
    private boolean helper(char[][] b){
        
        for(int i=0;i<b.length;i++){
            
            
            for(int j=0;j<b[0].length;j++){
                
                if(b[i][j]=='.'){
                    
                    for(char c='1';c<='9';c++){
                        if(isvalid(b,i,j,c)){
                            b[i][j]=c;
                            if(helper(b))
                                return true;
                            else
                                b[i][j]='.';
                        }
                        
                        
                        
                    }
                    return false;
                    
                    
                }
                
                
                
            }
           
            
        }
        
         return true;
        
        
        
    
    
    
}
    
}