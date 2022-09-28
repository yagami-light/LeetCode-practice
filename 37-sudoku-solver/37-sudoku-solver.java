class Solution {
    public void solveSudoku(char[][] board) {
        
        
        helper(board);
        
        
    }
    
    private boolean helper(char[][] board){
        
        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(board[i][j]=='.'){
                    
                    for(char ch='1';ch<='9';ch++ ){
                    
                    
                    if(isValid(board,i,j,ch)){
                        
                        board[i][j]=ch;
                        if(helper(board)){
                            return true;
                        }else{
                            board[i][j]='.';
                        }
                        
                    }
                       
                        
                        
                    }
                    
                    return false;
                }
                
            }
            
        }
        return true;
        
        
    }
    private boolean isValid(char[][] board,int i,int j,char ch){
        
        int m=board.length;
        int n=board[0].length;
        for(int k=0;k<m;k++){
            if(board[k][j]==ch) return false;
            
            if(board[i][k]==ch) return false;
            
            if(board[3*(i/3) + k/3][3*(j/3) + k%3]==ch) return false;
            
            
        }
        
        return true;
        
       
            
        }
        
        
        
        
    }
    
    
    
