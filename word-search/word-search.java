class Solution {
    public boolean exist(char[][] board, String word) {
        
        return existUtil(board,word);
    }
    
    
    private boolean existUtil(char[][] board,String word){
        int m=board.length;
        int n=board[0].length;
        char[] wordArray=word.toCharArray();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(wordArray[0]==board[i][j] && existUtilWrap(board,wordArray,0,i,j))
                    return true;
                
            }
        }
        
        return false;
        
        
    }
    
    
    private boolean existUtilWrap(char[][] board,char[] word,int index,int i,int j){
        if(i<0 || j<0 || i==board.length || j==board[0].length)
            return false;
        if(index>=word.length)
            return false;
        if(index==word.length-1 && word[index]==board[i][j]){
            
            return true;
            
        }
        
        
       if(board[i][j]==word[index]){
           char c=board[i][j];
           board[i][j]='0';
           boolean found=  (existUtilWrap(board,word,index+1,i-1,j) ||  existUtilWrap(board,word,index+1,i+1,j) || existUtilWrap(board,word,index+1,i,j-1) || existUtilWrap(board,word,index+1,i,j+1));
           board[i][j]=c;
           return found;
           
       }
        
        return false;
        
        
        
        
    }
    
}