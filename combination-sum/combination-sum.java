class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> result=new ArrayList();
        
        backTrack(cand,0,new ArrayList(),result,target);
        
        return result;
        
        
    }
    
    
    private void backTrack(int[] cand,int index,List<Integer> tempList,List<List<Integer>> result,int target){
        if(target<0)
            return;
        if(target==0){
            result.add(new ArrayList(tempList));
            return;
        }
        
        for(int i=index;i<cand.length;i++){
            tempList.add(cand[i]);
            // newTarget=target-nums[i];
            // if(target>cand[i])
            backTrack(cand,i,tempList,result,target-cand[i]);
//             else
//             backTrack(cand,index+1,tempList,result,target-cand[i]);
    
            tempList.remove(tempList.size()-1);
            
            
        }
        
        
    }
    
}