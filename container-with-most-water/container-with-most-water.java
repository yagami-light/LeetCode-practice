class Solution {
    public int maxArea(int[] nums) {
        int max=Integer.MIN_VALUE;
        int i=0,j=nums.length-1;
        
        while(i<j){
            
            
            int minHeight=Math.min(nums[i],nums[j]);
            max=Math.max(max,minHeight*(j-i));
            if(nums[i]<nums[j])
                i++;
            else
                j--;
            
            
            
        }
        
        
        return max;
    }
}