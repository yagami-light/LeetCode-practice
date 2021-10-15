class Solution {
    public int combinationSum4(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap();
        
        
        return combSum4(nums,target,map);
        
    }
    
    
    private int combSum4(int[] nums,int target,Map<Integer,Integer> map){
        if(map.get(target)!=null)
            return map.get(target);
        if(target==0)
            return 1;
        if(target<0)
            return 0;
        
        int res=0;
        for(int i=0;i<nums.length;i++){
            
            
            res+=combSum4(nums,target-nums[i],map);
            
            
        }
        
        
        map.put(target,res);
        return map.get(target);
        
        
        
        
        
    }
    
    
}