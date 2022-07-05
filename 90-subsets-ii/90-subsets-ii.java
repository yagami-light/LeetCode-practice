class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        subsetsWithDupUtil(nums,0,new ArrayList(),result,used);
        
        return result;
        
    }
    private void subsetsWithDupUtil(int[] nums,int index,List<Integer> currList,List<List<Integer>> result,boolean[] used){
        result.add(new ArrayList(currList));
        
        for(int i=index;i<nums.length;i++){
            // if(used[i]) continue;
            if(i>index && nums[i]==nums[i-1]) continue;
            currList.add(nums[i]);
            used[i]=true;
            subsetsWithDupUtil(nums,i+1,currList,result,used);
            currList.remove(currList.size()-1);
            used[i]=false;
            
            
            
            
        }
        
        
    }
    
    
}