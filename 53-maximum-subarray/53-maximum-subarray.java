class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int maxLocal=0;
        
        for(int n: nums){
            maxLocal=Math.max(n+maxLocal,n);
            maxSum=Math.max(maxSum,maxLocal);
        }
        
        return maxSum;
        
        
    }
}