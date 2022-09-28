class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res=new ArrayList();
        int index=0;
        helper(nums,new ArrayList(),res,index);
        return res;
        
        
    }
    
    private void helper(int[] nums,List<Integer> currList,List<List<Integer>> res,int index){
        
        res.add(new ArrayList(currList));
        if(index>=nums.length) return;
        
        for(int i=index;i<nums.length;i++){
        
        currList.add(nums[i]);
        helper(nums,currList,res,i+1);
        currList.remove(currList.size()-1);
        }
        
        
        
    }
    
    
}