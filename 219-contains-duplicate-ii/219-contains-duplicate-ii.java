class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        
        for(int i=0;i<nums.length;i++){
            
            Integer prevIndex=map.put(nums[i],i);
            if(prevIndex!=null && (i-prevIndex) <=k) return true;
        }
        return false;
        
    }
}