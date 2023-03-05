class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map=new HashMap();
        int size=nums.length;
        for(int i=0;i<size;i++){
            
            if(map.get(target-nums[i])!=null)
                return new int[]{map.get(target-nums[i]),i};
            map.put(nums[i],i);
            
        }
        return new int[]{-1,-1};
    }
}