class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        
        List<List<Integer>> res=new ArrayList();
        
        subSetsUtil(nums,new ArrayList(),0,res);
        
        return res;
        
        
    }
    
    private void subSetsUtil(int[] nums,List<Integer> currList,int index,List<List<Integer>> res){
        
        res.add(new ArrayList(currList));
        
        for(int i=index;i<nums.length;i++){
            if(currList.contains(nums[i])) continue;
            currList.add(nums[i]);
            subSetsUtil(nums,currList,i+1,res);
                              
            currList.remove(currList.size()-1);
            
            
        }
        
        
        
        
        
    }
    
    
}