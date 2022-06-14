class Solution {
    public final Set<Integer> colSet=new HashSet();
    public final Set<Integer> diag1Set=new HashSet();
    public final Set<Integer> diag2Set=new HashSet();
    
    
    public int totalNQueens(int n) {
        return totalNQueen1(0,0,n);
        
    }
    
    public  int totalNQueen1(int row,int count,int n){
        
        for(int col=0;col<n;col++){
            
            if(colSet.contains(col)) continue;
            
            int diag1=row+col;
            int diag2=row-col;
            
            if(diag1Set.contains(diag1)) continue;
            if(diag2Set.contains(diag2)) continue;
            
            if(row==n-1){
                count++;
            }else{
                colSet.add(col);
                diag1Set.add(diag1);
                diag2Set.add(diag2);
                count=totalNQueen1(row+1,count,n);
                colSet.remove(col);
                diag1Set.remove(diag1);
                diag2Set.remove(diag2);
                
                
            }
            
            
                
            
        }
        return count;
        
        
    }
    
}