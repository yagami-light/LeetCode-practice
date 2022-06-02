class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(board[i][j]=='.')
                    continue;
                
                if(!isValid(board,i,j,m,n))
                    return false;
                
                
                }
            
        }
                
                
        return true;
        
        
        
    }
    
    private boolean isValid(char[][] board,int i,int j,int m,int n){
        char c=board[i][j];
        
        for(int k=0;k<m;k++){
            if(board[k][j]=='.')
                continue;
            if(k!=i && c==board[k][j])
                return false;
        }
        
        
         
        for(int k=0;k<n;k++){
            if(board[i][k]=='.')
                continue;
            if(k!=j && c==board[i][k])
                return false;
        }
        
        /*
        00 01 02 .03 04 05 
        10 11 12 .13 14 15
        20 21 22 .23 24 25
        
        n=9;
        
        */
        
        
        
        for(int k=0;k<n;k++){
            
            if(board[3*(i/3) +k/3][3*(j/3) +k%3]=='.')
                continue;
            
            if((3*(i/3) +k/3) !=i  && (3*(j/3) +k%3) !=j &&  board[3*(i/3) +k/3][3*(j/3) +k%3]==c){
                
//                 System.out.println("test"+i+" "+j+" "+k);
//                 System.out.println((3*i/3 +k/3));
//                 System.out.println((3*i/3 +k/3));
                
                return false;
                
                
            }
            
        }
        
        
        
        
        
        return true;
        
    }
    
    
                
                
                
                
}