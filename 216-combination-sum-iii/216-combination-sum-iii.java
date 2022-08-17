class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList();
        helper(k,n,new ArrayList(),res,0,1);
        
        return res;
        
    }
    
    private void helper(int k,int n,List<Integer> currList,List<List<Integer>> res,int currSum,int index){
        if(currList.size()==k && currSum==n){
            res.add(new ArrayList(currList));
            return;
        }
        
        for(int i=index;i<=9;i++){
            // if(!currList.contains(i)){
                currList.add(i);
                helper(k,n,currList,res,currSum+i,i+1);
            
                currList.remove(currList.size()-1);
            // }
        }
    }
    
}