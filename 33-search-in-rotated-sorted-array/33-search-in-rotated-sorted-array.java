class Solution {
    public int search(int[] nums, int target) {
        
        return searchUtil(nums,0,nums.length-1,target);
        
        
    }
    
    private int searchUtil(int[] nums, int start, int end,int target){
        if(start>end)
            return -1;
        
        
        int mid=(start+end)/2;
        
        int num=(nums[mid] < nums[0] == target <nums[0]) ?
            
                nums[mid] :
                target < nums[0] ?  Integer.MIN_VALUE : Integer.MAX_VALUE;
        if(num<target){
            return searchUtil(nums,mid+1,end,target);
        }else if(num>target)
            return searchUtil(nums,start,mid-1,target);
        
        return mid;
        
    }
    
    
}