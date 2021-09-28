class Solution {
    public int maxSubArray(int[] nums) {
        
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            if(currSum<0){
                currSum=0;
                
            }
            currSum+=nums[i];
            maxSum=Math.max(maxSum,currSum);
            
            
        }
        
        return maxSum;
        
        
        
    }
}