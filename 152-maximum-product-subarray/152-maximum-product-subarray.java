class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int globalMax=1;
        int globalMin=1;
        
        for(int i:nums){
            
            int currMax=Math.max(Math.max(i,i*globalMax),i*globalMin);
            int currMin=Math.min(Math.min(i,i*globalMax),i*globalMin);
            
            globalMax=currMax;
            globalMin=currMin;
            max=Math.max(globalMax,max);

            
            
            
            
        }
        
        return max;
        
        
    }
}