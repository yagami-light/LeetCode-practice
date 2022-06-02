class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set=new HashSet();
        
        int m=board.length;
        int n=board[0].length;
        
        
        for(int i=0;i<m;i++){
            
            
            for(int j=0;j<n;j++){
                
                char c=board[i][j];
                if(c!='.')
                if(!set.add(c+"in row of "+i)
                  ||!set.add(c+"in col of "+j)
                  ||!set.add(c+"in row of "+i/3+" "+j/3))
                    return false;
                
            }
            
            
        }
        
        return true;
        
    }
}