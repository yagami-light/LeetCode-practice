class Solution {
    public int removeDuplicates(int[] nums) {
        int in=0;
        
        for(int e:nums){
            
            if(in==0 
              || in==1
              || e!=nums[in-2]){
                nums[in]=e;
                in++;
            }
            
        }
        return in;
        
    }
}