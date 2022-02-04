class Solution {
    public int rob(int[] nums) {
        int[] cache=new int[nums.length];
        Arrays.fill(cache,-1);
        return robUtil(nums,0,cache);
    }
    
    
    private int robUtil(int[] nums, int index,int[] cache){
        if(index>=nums.length)
            return 0;
        
        if(cache[index]!=-1)
            return cache[index];
        
        int skipCurrent=robUtil(nums,index+1,cache);
        int takeCurrent=nums[index]+robUtil(nums,index+2,cache);
        
        int maxAmount=Math.max(skipCurrent,takeCurrent);
        cache[index]=maxAmount;
        return maxAmount;
        
        
    }
    
    
}