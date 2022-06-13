class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList();
        solveNQueens(new ArrayList(),res,n);
        return res;
    }
    
    private void solveNQueens(List<Integer> currentQueen,List<List<String>> res,int n){
        if(currentQueen.size()==n){
            List<String> temp=new ArrayList();
            
            for(int i:currentQueen){
                char[] chars=new char[n];
                Arrays.fill(chars,'.');
                chars[i]='Q';
                temp.add(new String(chars));
            }
            
            res.add(temp);
        }
        
        for(int col=0;col<n;col++){
            
            if(!currentQueen.contains(col) && !digAttack(currentQueen,col)){
                
                currentQueen.add(col);
                solveNQueens(currentQueen,res,n);
                currentQueen.remove(currentQueen.size()-1);
                
                
            }
            
            
            
        }
        
        
        
    }
    
    private boolean digAttack(List<Integer> currentQueen,int col){
        int currentCol=col;
        int currentRow=currentQueen.size();
        
        for(int row=0;row<currentQueen.size();row++){
            
            if((Math.abs(row-currentRow)) == Math.abs(currentCol-currentQueen.get(row)))
                return true;
            
        }
        
        return false;
        
        
    }
    
    
}