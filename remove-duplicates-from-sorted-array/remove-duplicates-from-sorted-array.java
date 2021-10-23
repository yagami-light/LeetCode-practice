class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int n=nums.length;
       
        for(int i=1;i<nums.length;i++){
            
            // System.out.println("printing array "+Arrays.toString(arr));
            if(nums[i] == nums[i-1]) count++;
            else{
                
                nums[i-count] = nums[i];
            }
            }
            
            
        
        return n-count;
        
    }
}