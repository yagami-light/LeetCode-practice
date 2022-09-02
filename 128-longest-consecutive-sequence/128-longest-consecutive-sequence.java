class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet(Arrays.stream(nums).boxed().toList());
        int max=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            if(!set.contains(num-1)){
                
                while(set.contains(num++)){
                    count++;
                    
                }
                max=Math.max(count,max);
            }
            
        }
        
        return max;
        
        
    }
}