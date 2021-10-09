class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        boolean[] used=new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums,new ArrayList(),result,used);
        
        
        return result;
        
    }
    
    
    private void backTrack(int[] nums,List<Integer> currentList,List<List<Integer>> result, boolean[] used){
        System.out.println(currentList);
        if(currentList.size()==nums.length){
            result.add(new ArrayList(currentList));
            return;
        }
        
        
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
           
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
             currentList.add(nums[i]);
            used[i]=true;
            backTrack(nums,currentList,result,used);
            currentList.remove(currentList.size()-1);
            used[i]=false;
            
            
        }
        
    }
    
    
}