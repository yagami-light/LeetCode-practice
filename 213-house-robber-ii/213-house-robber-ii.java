class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Map<Integer,Integer> cache=new HashMap();
        int firstSkip=robUtil(nums,1,cache,nums.length);
        cache.clear();
        int lastSkip=robUtil(nums,0,cache,nums.length-1);
        
        return Math.max(firstSkip,lastSkip);
        
        
    }
    
    
    private int robUtil(int[] nums, int index,Map<Integer,Integer> cache,int eIndex){
        
        if(index>=eIndex)
            return 0;
        if(cache.get(index)!=null)
            return cache.get(index);
        
        int ifSkip=robUtil(nums,index+1,cache,eIndex);
        int taken=nums[index]+robUtil(nums,index+2,cache,eIndex);
        
        
        cache.put(index,Math.max(ifSkip,taken));
        
        return cache.get(index);
        
        
    }
    
}