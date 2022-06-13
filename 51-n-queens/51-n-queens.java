class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>>  res=new ArrayList();
        backTrack(new ArrayList(),res,n);
        return res;
        
    }
    
    
    private void backTrack(List<Integer> currentQueen,List<List<String>> res,int n){
        if(currentQueen.size()==n){
            List<String> temp=new ArrayList();
            for(int i=0;i<n;i++){
                char[] t=new char[n];
                Arrays.fill(t,'.');
                t[currentQueen.get(i)]='Q';
                temp.add(new String(t));
            }
            res.add(temp);
            return;
        }
        
        for(int col=0;col<n;col++){
            if(!currentQueen.contains(col)){
                
                if(diagAttack(currentQueen,col))
                    continue;
                
                currentQueen.add(col);
                backTrack(currentQueen,res,n);
                currentQueen.remove(currentQueen.size()-1);
                
            }
        }
        
    }
    
    private boolean diagAttack(List<Integer> currentQueen,int col){
           int current_row = currentQueen.size();
    int current_col = col;
    //判断每一行的皇后的情况
    for (int row = 0; row < currentQueen.size(); row++) {
        //左上角的对角线和右上角的对角线，差要么相等，要么互为相反数，直接写成了绝对值
        if (Math.abs(current_row - row) == Math.abs(current_col - currentQueen.get(row))) {
            return true;
        }
    }
    return false;
    }
    
    
}