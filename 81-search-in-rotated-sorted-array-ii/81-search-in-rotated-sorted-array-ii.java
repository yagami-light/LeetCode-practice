class Solution {
    public boolean search(int[] nums, int target) {
        
        
        return searchUtil(nums,target,0,nums.length-1);
        
    }
    
    
    private boolean searchUtil(int[] nums, int target,int start, int end ){
        if(start>end)
            return false;
        
        int mid=(start+end)/2;
        
        if(nums[mid]==target)
            return true;
        
        if(nums[start]==nums[mid] && nums[end]==nums[mid])
            return searchUtil(nums,target,start+1,end-1);
        
        else if(nums[start]<=nums[mid] ){
            
            if(nums[start]<=target && target<nums[mid]){
                
                return searchUtil(nums,target,start,mid-1);
                
            }else
                
                return searchUtil(nums,target,mid+1,end);
            
            
        }else{
            
            if(target<=nums[end] && nums[mid]<target){
                
                return searchUtil(nums,target,mid+1,end);
                
            }else
                
                return searchUtil(nums,target,start,mid-1);
            
        }
        
        
        
        
    }
    
    
}