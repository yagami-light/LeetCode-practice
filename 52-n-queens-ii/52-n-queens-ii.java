class Solution {
    public int totalNQueens(int n) {
        List<List<String>> res=new ArrayList();
        
        totalNQueens(new ArrayList(),res,n);
        
        return res.size();
        
    }
    
    private void totalNQueens(List<Integer> currentQueen,List<List<String>> res,int n){
        if(currentQueen.size()==n){
            List<String> temp=new ArrayList();
            for(int i:currentQueen){
                char[] charc=new char[n];
                Arrays.fill(charc,'.');
                charc[i]='Q';
                temp.add(new String(charc));
            }
            
            
            res.add(temp);
            
        }
        
        for(int col=0;col<n;col++){
            if(!currentQueen.contains(col) && !diagAttack(currentQueen,col)){
                
                currentQueen.add(col);
                totalNQueens(currentQueen,res,n);
                currentQueen.remove(currentQueen.size()-1);
                
                
                
            }
        }
        
        
        
    }
    
    
    private boolean diagAttack(List<Integer> currentQueen,int col){
        
        int curerntRow=currentQueen.size();
        int currentCol=col;
        
        for(int row=0;row<currentQueen.size();row++){
            
            if(Math.abs(curerntRow-row)==Math.abs(currentCol-currentQueen.get(row)))
                return true;
            
        }
        return false;
        
    }
    
    
}