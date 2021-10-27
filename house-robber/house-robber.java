class Solution {
    public int rob(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap();
        return robUtil(nums,0,0,map);
    }
    
    
    private int robUtil(int[] nums,int index,int currValue,Map<Integer,Integer> map){
        
        if(index >= nums.length)
            return 0;
        if(map.get(index)!=null)
            return map.get(index);
        
        int ifTaken=nums[index]+robUtil(nums,index+2,currValue+nums[index],map);
        
        int ifNotTaken=robUtil(nums,index+1,currValue,map);
        
        int maxValue=Math.max(ifTaken,ifNotTaken);
        
        
        map.put(index,maxValue);
    
    
        return map.get(index);
    }
    
    
}