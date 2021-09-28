class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxTillEnd=nums[0];
        int maxSoFar=nums[0];
        
        
        for(int i=1;i<nums.length;i++){
            maxTillEnd=Math.max(maxTillEnd+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar,maxTillEnd);
            
        }
        
        
        return maxSoFar;
        
    }
}