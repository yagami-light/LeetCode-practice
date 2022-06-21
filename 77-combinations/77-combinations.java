class Solution {
    public List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> res=new ArrayList();
        combineUtil(n,k,new ArrayList(),res,1);
        return res;
    }
    
    private void combineUtil(int n,int k,List<Integer> currList,List<List<Integer>> res,int index){
        if(currList.size()==k){
            
            res.add(new ArrayList(currList));
            return;
            
        }
        
        for(int i=index;i<=(n-(k-currList.size())+1);i++){
            
            currList.add(i);
            combineUtil(n,k,currList,res,i+1);
            currList.remove(currList.size()-1);
            
            
        }
        
        
        
        
    }
    
    
}