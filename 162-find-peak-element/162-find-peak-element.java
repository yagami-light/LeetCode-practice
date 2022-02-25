class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        return findPeakBin(nums,0,nums.length-1);
    }
    
    
    private int findPeakBin(int[] nums,int start,int end){
       
        System.out.println("start "+start+" end "+end);
        
        if(start>end)
            return -1;
        
        int mid=(start+end)/2;
        
        if(0<mid && mid<nums.length-1 && nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]|| (mid==0 && mid<nums.length-1 && nums[mid]>nums[mid+1] ) || (mid>0 && mid==nums.length-1 && nums[mid]>nums[mid-1] ))
            return mid;
        
        else if(mid==0 || nums[mid-1]<nums[mid]){
            
                return findPeakBin(nums,mid+1,end);
            
        }else 
            
            return findPeakBin(nums,start,mid-1);
            
            
        
        
        
    }
    
}