class Solution {
    public int findMin(int[] nums) {
        
        return findMinPivot(nums,0,nums.length-1);
    }
    
    
    private int findMinPivot(int[] nums,int start,int end){
        
        int mid=(start+end)/2;
        
        if(nums[mid]>nums[end])
            return findMinPivot(nums,mid+1,end);
        else if(nums[mid]<nums[end])
            return findMinPivot(nums,start,mid);
        
        
        return nums[start];
    }
    
    
}