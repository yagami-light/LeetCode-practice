class Solution {
     public final Set<Integer> setCol=new HashSet();
        public final Set<Integer> setDiag1=new HashSet();
        public final Set<Integer> setDiag2=new HashSet();
    public int totalNQueens(int n) {
       
      return totalNQueensUtil(0,0,n);
    }
    
    
    private int totalNQueensUtil(int row,int count,int n){
        for(int col=0;col<n;col++){
            
            if(setCol.contains(col)) continue;
            
            int diag1=col-row;
            int diag2=col+row;
            if(setDiag1.contains(diag1)) continue;
            
            if(setDiag2.contains(diag2)) continue;
            if(row==n-1){
                count++;
                
            }else{
                
                setCol.add(col);
                setDiag1.add(diag1);
                setDiag2.add(diag2);
                 count=totalNQueensUtil(row+1,count,n);
                setCol.remove(col);
                setDiag1.remove(diag1);
                setDiag2.remove(diag2);

                
            }

            
            
        }
        return count;
        
        
        
    }
    
}