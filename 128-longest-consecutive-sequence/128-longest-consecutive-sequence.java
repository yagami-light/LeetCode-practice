class Solution {
    public int longestConsecutive(int[] nums) {
          Set<Integer> set=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            
            if(!set.contains(nums[i]-1)){
                int length=0;
                int j=nums[i];
                    
                while(set.contains(j++)) length++;
                maxLength=Math.max(maxLength,length);
                
            }
            
            
            
        }
        
        
        return maxLength;
        
        
    }
}