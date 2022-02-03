class Solution {
    public int search(int[] nums, int target) {
        
        int minIndex=searchMinIndex(nums,0,nums.length-1);
        
        int firstcheck=binSearch(nums,0,minIndex-1,target);
        if(firstcheck ==-1)
            return binSearch(nums,minIndex,nums.length-1,target);
            else
                return firstcheck;
        
        
        
    }
    
    
    
    private int searchMinIndex(int[] nums,int start,int end){
        
        int mid=(start+end)/2;
        
        if(nums[mid]>nums[end])
            return searchMinIndex(nums,mid+1,end);
        else if(nums[mid]<nums[end])
            return searchMinIndex(nums,start,mid);
        
        
        
        return start;
        
    }
    
    private int binSearch(int[] nums,int start, int end, int target){
        if(start> end)
            return -1;
        
        int mid=(start+end)/2;
        if(nums[mid]==target)
            return mid;
        
        if(nums[mid]<target)
            return binSearch(nums,mid+1,end,target);
        else
            return binSearch(nums,start,mid-1,target);
    }
    
}