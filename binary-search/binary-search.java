class Solution {
    public int search(int[] nums, int target) {
        return searchUtil(nums,target,0,nums.length-1);
    }
    
    private int searchUtil(int[] nums,int target,int sIndex,int eIndex){
        if(sIndex>eIndex)
            return -1;
        int mid=(sIndex+eIndex)/2;
        if(nums[mid]==target)
            return mid;
        
        if(nums[mid]<target)
            return searchUtil(nums,target,mid+1,eIndex);
        else
            return searchUtil(nums,target,sIndex,mid-1);
        
        
    }
}