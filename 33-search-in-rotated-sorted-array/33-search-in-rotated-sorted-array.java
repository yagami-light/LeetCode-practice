class Solution {
    public int search(int[] nums, int target) {
        
        int pivot=searchPivot(nums,0,nums.length-1,target);
        
        System.out.println("pivot is "+pivot);
        if(nums[pivot]==target)
            return pivot;
        int leftHalf=searchBinUtil(nums,0,nums.length-1,target,pivot);
        if(leftHalf!=-1)
            return leftHalf;
            else
                return searchBinUtil(nums,pivot,nums.length-1,target,pivot);
        
        
        // return -1;
    }
    
    
    private int searchPivot(int[] nums,int start,int end, int target){
        /*
        
       4 1,,6
        
        */
        System.out.println("start "+start+" end "+end);
        int mid=(start+end)/2;
        System.out.println("mid "+mid);
        if(nums[mid]>nums[end])
            return searchPivot(nums,mid+1,end,target);
        else if(nums[mid]<nums[start])
            return searchPivot(nums,start,mid,target);
        
        
        
        
        return start;
    }
    
    private int searchBinUtil(int[] nums, int start, int end,int target,int pivot){
        if(start>end)
            return -1;
        
        
        int mid=(start+end)/2;
        
        int roateMid=(mid+pivot)%nums.length;
        if(nums[roateMid]==target)
            return roateMid;
        if(target<nums[roateMid]){
            return searchBinUtil(nums,start,mid-1,target,pivot);
        }else{
            return searchBinUtil(nums,mid+1,end,target,pivot);
        }
        
    }
    
    
    
}

/*




*/