class Solution {
    public int findPeakElement(int[] nums) {
        
        return findPeakUtil(nums,0,nums.length-1);
    }
    
    private int findPeakUtil(int[] nums, int start, int end){
        
        if(start==end)
            return start;

            // return -1;
        
        
        int mid1=(start+end)/2;
        int mid2=mid1+1;
        
        if(nums[mid1]>nums[mid2]){
            return findPeakUtil(nums,start,mid1);
        }else
            return findPeakUtil(nums,mid2,end);
        
        
    }
    
}