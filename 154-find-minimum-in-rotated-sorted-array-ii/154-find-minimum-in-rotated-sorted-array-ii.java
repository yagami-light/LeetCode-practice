class Solution {
    public int findMin(int[] nums) {
        int len=nums.length;
        int start=0,end=len-1;
        return helper(nums,start,end);
        
    }
    
    private int helper(int[] nums,int start,int end){
        if(start==end)
            return nums[start];     
        int mid=(start+end)/2;
        if(nums[mid]==nums[end]){
            if(end!=0 && nums[end] >=nums[end])
                
            return helper(nums,start,end-1);
            //else
            
            
            
        }
        if(nums[mid]>nums[end]){
            
            return helper(nums,mid+1,end);
        }
        else
            
            return helper(nums,start,mid);
        
        
    }
    
}