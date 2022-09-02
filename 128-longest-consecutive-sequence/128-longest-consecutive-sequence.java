class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set=new HashSet(Arrays.stream(nums).boxed().toList());
        for(int i:nums){
            int count=0;
            int num=i;
            if(!set.contains(num-1)){
                
                while(set.contains(num)){
                    num++;
                    count++;
                }
                
            }
            max=Math.max(count,max);
            
        }
        return max;
        
        
    }
}