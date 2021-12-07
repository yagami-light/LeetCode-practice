class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        return twoSumUtil(nums,target);
        
    }
    
    
    
    private int[] twoSumUtil(int[] nums,int target){
        
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            
            if((map.get(target-nums[i])!= null))
                return new int[]{map.get(target-nums[i]),i};
            else{
                map.put(nums[i],i);
            }
            
        }
        
        return new int[]{-1,-1};
        
    }
}