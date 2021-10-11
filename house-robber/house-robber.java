class Solution {
    public int rob(int[] nums) {
        
        return robUtil(nums);
    }
    
    
    private int robUtil(int[] nums){
        Map<Integer,Integer> map=new HashMap();
        return robWrap(nums,0,map);
        
        
    }
    
    
    
    private int robWrap(int[] nums,int index, Map<Integer,Integer> map){
        if(map.get(index)!=null)
            return map.get(index);
        if(index>=nums.length)
            return 0;
       
    
        int skip=robWrap(nums,index+1,map);
        int taken=nums[index]+robWrap(nums,index+2,map);
        
        int maxValue= Math.max(skip,taken);
        map.put(index,maxValue);
        return map.get(index);
        
        
    }
    
    
}