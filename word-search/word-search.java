class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                
                if(isWordExist(board,word,board[i][j], i, j))
                    return true;
                
            }
            
        }
        
        
        return false;
        
        
    }
    
    
    
    private boolean isWordExist(char[][] board,String word,char c,int i,int j){
        char[] wordArray=word.toCharArray();
        return isWordMatched(board,wordArray,i,j,0);
        
        
    }
    
    
    private boolean isWordMatched(char[][] board,char[] cArray,int indexI,int indexJ,int charIndex){
        if(charIndex>= cArray.length)
            return false;
        
        if(indexI>=board.length || indexJ >= board[0].length || indexI<0 ||  indexJ<0)
            return false;
        
        if(charIndex==cArray.length-1 && board[indexI][indexJ] == cArray[charIndex])
            return true;
        char c=board[indexI][indexJ];
        if(board[indexI][indexJ] == cArray[charIndex]){
            board[indexI][indexJ]='1';
            boolean isFound=  isWordMatched(board,cArray,indexI+1,indexJ,charIndex+1) || 
                    isWordMatched(board,cArray,indexI-1,indexJ,charIndex+1) ||
                    isWordMatched(board,cArray,indexI,indexJ+1,charIndex+1) ||
                    isWordMatched(board,cArray,indexI,indexJ-1,charIndex+1);
            
            
            board[indexI][indexJ]=c;
            return isFound;
        }
        
        return false;
        
    }
    
    
}