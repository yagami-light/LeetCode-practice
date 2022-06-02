class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int hi=nums.length-1;
        int[] ans=new int[]{-1,-1};
        
        while(low<=hi){
            
            int mid=low+(hi-low)/2;
            
            if(nums[mid]==target){
                
                int n=mid>0 ? nums[mid-1]: Integer.MIN_VALUE;
                if(target>n){
                    ans[0]=mid;
                }
                
                
                hi=mid-1;
                
            }else if(target<nums[mid]){
                
                hi=mid-1;
                
                
            }else{
                low=mid+1;
                
            }
            
            
            
            
            
        }
        
        low=0;
        hi=nums.length-1;
        
        while(low<=hi){
            
            int mid=low+(hi-low)/2;
            
            if(nums[mid]==target){
                
                int n = mid < nums.length - 1 ? nums[mid + 1] : Integer.MAX_VALUE;
            if (target < n) {
                ans[1] = mid;
                break;
            }
                
                low=mid+1;
                
            }else if(target<nums[mid]){
                
                hi=mid-1;
                
                
            }else{
                low=mid+1;
                
            }
            
            
            
            
            
        }
        
        
        return ans;
        
        
        
        
    }
}