class Solution {
    public int findPeakElement(int[] nums) {
        
        int n=nums.length;
        int res=0;
        for(int i=0;i<nums.length;i++){
            
            res=nums[res]==Math.max(nums[res],nums[i]) ? res: i;
            
        }
        
        return res;
        
    }
}