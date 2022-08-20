class Solution {
    public int maxSubArray(int[] nums) {
        
        int n=nums.length;
        int maxGlobal=Integer.MIN_VALUE;
        int maxSoFar=0;
        for(int i=0;i<n;i++){
            
             maxSoFar=Math.max(nums[i],maxSoFar+nums[i]);
            maxGlobal=Math.max(maxGlobal,maxSoFar);
            
        }
        
        return maxGlobal;
        
    }
}