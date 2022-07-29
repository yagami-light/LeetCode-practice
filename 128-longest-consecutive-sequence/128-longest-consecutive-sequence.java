class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet(Arrays.stream(nums).boxed().toList());
        // System.out.println(" set :"+set);
        Arrays.sort(nums);
        // System.out.println("print array :"+Arrays.toString(nums));
        int maxCount=0;
        int count=0;
        for(int i:nums){
            if(!set.contains(i-1)){
                count=0;
                int num=i;
                while(set.contains(num++)) {count++;
                                            
                                            // System.out.println("num is :"+num+" count is :"+count);
                                           }
                maxCount=Math.max(maxCount,count);
            }
            
            
        }
        
        
        return maxCount;
        
    }
}