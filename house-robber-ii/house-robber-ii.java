class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        Map<Integer,Integer> map=new HashMap();
        
        int firstIgnore=robUtil(nums,1,1,nums.length,map);
        map.clear();
        int lastIgnore=robUtil(nums,0,0,nums.length-1,map);
        return Math.max(firstIgnore,lastIgnore);
        
        
    }
    
    private int robUtil(int[] nums,int index,int start,int end,Map<Integer,Integer> map){
        if(index>=end)
            return 0;
        if(map.get(index)!=null)
            return map.get(index);
        
        
        int taken=nums[index]+robUtil(nums,index+2,start,end,map);
        int notTaken=robUtil(nums,index+1,start,end,map);
        
        int max=Math.max(taken,notTaken);
        map.put(index,max);
        
        return map.get(index);
        
    }
    
}