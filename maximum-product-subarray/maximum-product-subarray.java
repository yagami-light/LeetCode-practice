class Solution {
    public int maxProduct(int[] nums) {
        int maxGlobal=1;
        int minGlobal=1;
        int maxProduct=Integer.MIN_VALUE;
        int currMax=1;
        int currMin=1;
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            
             currMax=Math.max(Math.max(nums[i]*maxGlobal,nums[i]*minGlobal),nums[i]);
             currMin=Math.min(Math.min(nums[i]*maxGlobal,nums[i]*minGlobal),nums[i]);
            
            maxProduct=Math.max(maxProduct,Math.max(currMax,currMin));
            
            maxGlobal=currMax;
            minGlobal=currMin;
            
        }
        
        
        return maxProduct;
        
        
    }
}