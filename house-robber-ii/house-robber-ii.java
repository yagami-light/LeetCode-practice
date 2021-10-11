class Solution {
    public int rob(int[] nums) {
        
        
        return robUtil(nums);
        
    }
    
    
    private int robUtil(int[] nums){
        if(nums.length==1)
            return nums[0];
        Map<Integer,Integer> map=new HashMap();
        int[] visted=new int[nums.length];
        int first=nums[0];
        nums[0]=0;
        
        int excludeFirst= robWrap(nums, 0,map,visted,false);
        nums[0]=first;
        nums[nums.length-1]=0;
         Map<Integer,Integer> map2=new HashMap();
        int excludeLast=robWrap(nums,0,map2,visted,false);
        
        return Math.max(excludeFirst,excludeLast);
        
        
    }
    
    
    private int robWrap(int[] nums,int  index,Map<Integer,Integer> map,int[] visted,boolean revisted){
        if(map.get(index)!=null)
            return map.get(index);
        if(index>=nums.length)
           return 0;
                  
        
        int skip=robWrap(nums,(index+1),map,visted,revisted);
        int taken=nums[index]+robWrap(nums,(index+2),map,visted,revisted);
        
        int maxValue=Math.max(skip,taken);
        map.put(index,maxValue);
        visted[index]=1;
        return map.get(index);
        
        
        
    }
    
    
}