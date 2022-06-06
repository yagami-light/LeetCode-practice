class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> res=new ArrayList();
        
        combinationSum(cand, target, 0,new ArrayList(),res,0);
        
        
        return res;
        
        
    }
    
    private void combinationSum(int[] cand,int target,int currSum,List<Integer> currList,List<List<Integer>> res,int index){
        if(target<0)
            return;
        
        else if(target==0) res.add(new ArrayList(currList));
            
        else{
            
            for(int i=index;i<cand.length;i++){
                
                currList.add(cand[i]);
                combinationSum(cand,target-cand[i],0,currList,res,i);
                currList.remove(currList.size()-1);
                
            }
            
            
        }
        
        
        
    }
    
    
}