class Solution {
    public boolean canJump(int[] nums) {
        
        
       return canJumUtil(nums);
        
    }
    
    private boolean canJumpUtil(int[] nums, int index){
        
        int n=nums.length;
        if(index>=n-1)
            return true;
        boolean  canJump=false;
        
        int range=index+nums[index];
        for(int i=index+1;i<=range;i++){
            
            canJump |= canJumpUtil(nums,i);
            
            
        }
        
        
        return canJump;
        
        
        
    }
    
    
    private boolean canJumUtil(int[] nums){
        int n=nums.length;
       
        int lastGoodPosition=n-1;
        
        for(int i=n-1;i>=0;i--){
            
            if(i+nums[i]>=lastGoodPosition)
                
                lastGoodPosition=i;
            
        }
        
        return lastGoodPosition==0;
        
        
        
    }
    
    
    
    
    
    
}


/*

[2,3,1,1,4]







*/