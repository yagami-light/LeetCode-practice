class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet(Arrays.stream(nums).boxed().toList());
        // System.out.println("print set :"+set);
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            
            int num=nums[i];
            if(!set.contains(num-1)){
               while(set.contains(num++)){
                   count++;
               }
                
            }
            max=Math.max(max,count);
            count=0;
            
        }
        
        return max;
        
    }
}