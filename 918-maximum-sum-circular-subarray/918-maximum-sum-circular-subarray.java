class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int nonCircularSum=kadamAlgo(nums);
        int total=0;
        
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            nums[i]=-nums[i];
            
            
        }
        
        int cirCularSum=total+kadamAlgo(nums);
        if(cirCularSum==0)
            return nonCircularSum;
        return Math.max(nonCircularSum,cirCularSum);
        
        
        
        
    }
    
    private int kadamAlgo(int[] nums){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int c: nums){
            currSum=Math.max(c,currSum+c);
            max=Math.max(max,currSum);
        }
        
        return max;
        
    }
    
    
}

/*

1,-2,3,-2

-1,2,-3,2

sum:2
totalSum:0
-()



*/