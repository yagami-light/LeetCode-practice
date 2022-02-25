class Solution {
    public int search(int[] nums, int target) {
        
        return searchUtil(nums,target,0,nums.length-1);
    }
    
    private int searchUtil(int[] nums,int target,int start,int end){
        
        if(start>end)
            return -1;
        
        int mid=(start+end)/2;
        
        if(nums[mid] == target)
            return mid;
        
        else if(nums[start]<= nums[mid]){
            
            if(nums[start] <=target && target<nums[mid])
                return searchUtil(nums,target,start,mid-1);
            else
                return searchUtil(nums,target,mid+1,end);
            
            
            
        }else{
            
            if(nums[mid] < target && target <= nums[end])
                return searchUtil(nums, target,mid+1,end);
            else
                return searchUtil(nums,target,start,mid-1);
            
            
        }
        
        
        
        
        
    }
    
}