class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map=new HashMap();
        int lengthOfArray=nums.length;
        for(int i=0;i<lengthOfArray;i++){
            
            if(map.get(target-nums[i])!=null){
                return new int[]{map.get(target-nums[i]),i};
            }
            else
                map.put(nums[i],i);
            
        }
        
        return new int[]{-1,-1};
        
    }
}