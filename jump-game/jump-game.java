class Solution {
    public boolean canJump(int[] nums) {
        return canJumpUtil(nums);
        
    }
    
    
    private boolean canJumpUtil(int[] nums){
        int lastGoodPosIndex=nums.length-1;
        
        for(int i=nums.length-1;i>=0;i--){
            
            if(i+nums[i] >= lastGoodPosIndex){
                lastGoodPosIndex=i;
            }
            
            
        }
        
        return lastGoodPosIndex == 0;
        
    }
    
}