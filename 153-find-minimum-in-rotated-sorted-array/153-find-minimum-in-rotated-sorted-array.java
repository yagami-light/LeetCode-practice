class Solution {
    public int findMin(int[] nums) {
    
        return findMin(nums,0,nums.length-1);
        
    }
    
    
    
    private int findMin(int[] nums, int start,int end){
        
        
        int mid=(start+end)/2;
        System.out.println("mid "+mid);
        
        if(nums[mid]>nums[end])
            return findMin(nums,mid+1,end);
        else if(nums[mid]<nums[end])
            return findMin(nums,start,mid);
        
        
        return nums[start];
        
        
        
        
        
        
    }
    
    
    
}