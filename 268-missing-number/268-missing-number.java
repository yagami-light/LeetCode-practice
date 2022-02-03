class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int missingNo=0;
        
        for(int i=1;i<n+1;i++){
            
            missingNo ^= i;
            missingNo ^= nums[i-1];
            
        }
        
        return missingNo;
        
        
        
    }
}