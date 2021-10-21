class Solution {
    public int search(int[] nums, int target) {
        int piot=searchUtilPiot(nums,0,nums.length-1);
        System.out.println("piot index "+piot);
        return searchUtil(nums,0,nums.length-1,piot,nums.length,target);
        
        
    }
    
    private int searchUtilPiot(int[] nums, int start,int end){
        if(start>end)
            return -1;
        
        int mid=(start+end)/2;
        //4,6,7,0,1,2
        
        //6,8,9,0,1,2
        if(nums[mid]>nums[end])
            return searchUtilPiot(nums,mid+1,end);
        if(nums[mid]<nums[start])
            return searchUtilPiot(nums,start,mid);
        
        return start;
        
    }
    
    
    
    private int searchUtil(int[] nums,int start, int end,int piovt,int n,int target){
        if(start>end)
            return -1;
        
        int mid=(start+end)/2;
        int mid2=(mid+piovt)%n;
        if(nums[mid2]==target)
            return mid2;
        
        if(nums[mid2]<target)
            return searchUtil(nums,mid+1,end,piovt,n,target);
        else return searchUtil(nums,start,mid-1,piovt,n,target);
            
        
        
        
        
    }
}