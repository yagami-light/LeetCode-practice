class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet();
        for(int i:nums) set.add(i);
        
        int max=0;
        // int count=0;
        for(int i:nums){
        int num=i;
        int count=0;
        if(!set.contains(num-1)){
            while(set.contains(num)){
            count++;
                
            num++;
            }
            max=Math.max(max,count);
        }
            
        }
        
        
        return max;
        
    }
}