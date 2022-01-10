class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        Map<Integer,Integer> cache=new HashMap();
        return combinationSum4Util(nums,target,cache);
        
    }
    
    
    private int combinationSum4Util(int[] nums, int target, Map<Integer,Integer> cache){
        if(target==0)
            return 1;
        if(target<0)
            return 0;
        if(cache.get(target)!=null)
            return cache.get(target);
        int res=0;
        for(int i:nums){
            
            res+=combinationSum4Util(nums,target-i,cache);
            
            
        }
        
        
        cache.put(target,res);
        return cache.get(target);
        
    }
    
}