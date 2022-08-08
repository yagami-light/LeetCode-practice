class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        return helper(nums,target,0,nums.length-1);
    }
    
    private int[] helper(int[] nums,int target,int start,int end){
        if(start==end)
            return new int[]{-1,-1};
        if(nums[start]+nums[end]==target)
            return new int[]{start+1,end+1};
        else if((nums[start]+nums[end]<target))
            return helper(nums,target,start+1,end);
        else if((nums[start]+nums[end]>target))
       return helper(nums,target,start,end-1);
    
    
         return new int[]{-1,-1}; 
    }
    
}