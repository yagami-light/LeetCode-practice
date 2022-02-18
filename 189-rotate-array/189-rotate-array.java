class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0)
            return;
        
         k=k%(nums.length);
        
        
         int firstEnd=nums.length-k;   
        
        
        reverseArray(nums,0,firstEnd-1);
        reverseArray(nums,firstEnd,nums.length-1);
        reverseArray(nums,0,nums.length-1);
        
        
    }
    
    
    private void rotateRight(int[] nums){
        
        int temp=nums[nums.length-1];
        
        for(int i=nums.length-1;i>0;i--){
            
            nums[i]=nums[i-1];
            
        }
        nums[0]=temp;
        
        
    }
    
    private void reverseArray(int[] nums, int start, int end){
        while(start<end){
            
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            
            
        }
        
        System.out.println(Arrays.toString(nums));
        
        
    }
    
    
    
    /*
    
    
    1,2,3,4,5,6,7
    
    */
    
    
    
}