class Solution {
    public int rob(int[] nums) {
        Map<Integer,Integer> cache=new HashMap();
        return robUtil(nums,0,cache);
    }
    
    
    private int robUtil(int[] nums,int index,Map<Integer,Integer> cache){
        if(index>= nums.length)
            return 0;
        
        
        if(cache.get(index)!=null)
            return cache.get(index);
        int skipCurrent=robUtil(nums,index+1,cache);
        
        int takeCurrent=nums[index]+robUtil(nums,index+2,cache);
        
        cache.put(index, Math.max(skipCurrent,takeCurrent));
        return cache.get(index);
        
        
    }
    
    
}