class Solution {
    public boolean canJump(int[] nums) {
        
  
        return canJumpWrap2(nums);
        
        
    }
    
    
    private boolean canJumpWrap2(int[] nums){
        
        int lastGoodPos=nums.length-1;
        
        for(int i=nums.length-1;i>=0;i--){
            
            if(i+nums[i] >= lastGoodPos)
                lastGoodPos=i;
            
        }
        
        return lastGoodPos == 0;
        
    }
    
    
    private boolean canJumpWrap(int[] nums){
        Map<Integer,Boolean> cache=new HashMap();
        return canJumpUtil(nums,0,cache);
    }
    
    
    
    private boolean canJumpUtil(int[] nums,int index,Map<Integer,Boolean> cache){
        
        if(index>=nums.length-1)
            return true;
        
        boolean canJump=false;
        if(cache.get(index)!=null)
            return cache.get(index);
        
        for(int i=index+1;i<=(index+nums[index]);i++){
            
            canJump  =canJump | canJumpUtil(nums,i,cache);
            
        }
        
        cache.put(index,canJump);
        return cache.get(index);
        
        
        
    }
    
}