class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSubArray=Integer.MIN_VALUE;
        if(nums.length==1) return nums[0];
        int currMax=0;
        for(int i:nums){
            currMax=Math.max(i,i+currMax);
            maxSubArray=Math.max(maxSubArray,currMax);
            
        }
        
        return maxSubArray;
    }
}

/*
[-2,1,-3,4,-1,2,1,-5,4]



*/