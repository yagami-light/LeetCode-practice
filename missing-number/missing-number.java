class Solution {
    public int missingNumber(int[] nums) {
        int sumA=0,sumB=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            
            sumA+=i;
            sumB+=nums[i-1];
            
        }
        
        
        return sumA-sumB;
    }
}