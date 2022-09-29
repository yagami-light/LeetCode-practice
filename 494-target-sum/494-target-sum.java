class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return helper(nums,target,0,0);
        
        
    }
    
    private int  helper(int[] nums,int target,int currSum,int index){
        // if(target<currSum ) return 0;
        if(target==currSum && index==nums.length){
            return 1;
        }
        if(index>=nums.length) return 0;
        else{
            int count=0;
           count+= helper(nums,target,currSum+nums[index],index+1);
           count+= helper(nums,target,currSum-nums[index],index+1);

            
            
            return count;
            
            
        }
        
        
    }
    
}