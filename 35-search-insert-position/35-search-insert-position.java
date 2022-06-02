class Solution {

    /*
    0 1 2 3
    1,3,5,6
    
    0  1
    1  3
    
    
    */
    
    
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            
            else if(target<nums[mid])
                high=mid-1;
            else 
                low=mid+1;
            
            
        }
        
        
        
        return low;
        
        
        
    }
}