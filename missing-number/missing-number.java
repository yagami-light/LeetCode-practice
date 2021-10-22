class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int result=0;
        
        for(int i=1;i<=n;i++){
            
            result ^=nums[i-1];
            result ^=i;
            
        }
        
        return result;
        
    }
}