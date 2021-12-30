class Solution {
    public int removeDuplicates(int[] nums) {
        
        int replaceIndex=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]!=nums[i-1]){
               
                nums[replaceIndex++]=nums[i];
            }
            
            
            
        }
        
        
        //[1,1,2,2,2,3,3,3,4]
        
        return replaceIndex;
    }
}