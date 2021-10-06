class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result=new ArrayList();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        backTrack(nums,new ArrayList(),result,used);
        return result;
        
    }
    
    
    private void backTrack(final int[] nums,final List<Integer> currentList,final List<List<Integer>> result,boolean[] used){
        
        if(currentList.size()==nums.length){
            result.add(new ArrayList(currentList));
            return;
            
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(used[i] || (i>0 && nums[i]==nums[i-1] && !used[i-1])) continue;
            used[i]=true;
            currentList.add(nums[i]);
            backTrack(nums,currentList,result,used);
            used[i]=false;
            currentList.remove(currentList.size()-1);
            
            
        }
        
    }
    
}