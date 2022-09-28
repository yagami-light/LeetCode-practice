class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>  res=new ArrayList();
        
        helper(new ArrayList(),n,res);
        
        return res;
        
        
    }
    
    private void helper(List<Integer> currentQueen,int n,List<List<String>> res){
        if(currentQueen.size()==n){
            List<String> tempList=new ArrayList();
            for(int i:currentQueen){
                char[] chars=new char[n];
                Arrays.fill(chars,'.');
                chars[i]='Q';
                tempList.add(new String(chars));
                
            }
            res.add(tempList);
            
        }
        
        for(int col=0;col<n;col++){
            
            if(!currentQueen.contains(col) && !digAttack(currentQueen,col)){
                
                currentQueen.add(col);
                helper(currentQueen,n,res);
                currentQueen.remove(currentQueen.size()-1);
                
                
            }
            
            
        }
        
        
    }
    
    private boolean digAttack(List<Integer> currentQueen,int col){
        
        int currentRow=currentQueen.size();
        
        for(int row=0;row<currentQueen.size();row++){
            
            if(Math.abs(row-currentRow)==Math.abs(col-currentQueen.get(row))) return true;
            
        }
        return false;
        
        
    }
    
}
