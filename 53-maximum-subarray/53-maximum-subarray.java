class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax=Integer.MIN_VALUE;
        int currSoFar=0;
        for(int i:nums){
            
            currSoFar=Math.max(i,currSoFar+i);
            globalMax=Math.max(globalMax,currSoFar);
            
            
        }
        return globalMax;        
        
    }
}