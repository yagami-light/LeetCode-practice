class Solution {
    public int search(int[] nums, int target) {
        
        int piotIndex=0;
        for(int i=0;i<nums.length;i++){
            if(i>1 && (nums[i]<nums[i-1])){
                piotIndex=i-1;
                break;
            }
         
            
            
            
        }
        System.out.println("piotIndex "+piotIndex);
        int result=searchUtil(nums,target,0,piotIndex);
        if(result==-1)
            return searchUtil(nums,target,piotIndex+1,nums.length-1);
        else
            return result;
        
        
        
        
    }
    
    
    private int searchUtil(int[] nums, int target, int start, int end ){
        if(start>end)
            return -1;
        
        
        int mid=(start+end)/2;
        if(nums[mid]==target)
            return mid;
        
        
        if(nums[mid]<target)
            return searchUtil(nums,target,mid+1,end);
        else
            return searchUtil(nums,target,start,mid-1);
        
        
        
        
        
    }
}