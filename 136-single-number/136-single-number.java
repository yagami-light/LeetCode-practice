class Solution {
    public int singleNumber(int[] nums) {
      Arrays.sort(nums);
        System.out.println("print array :"+Arrays.toString(nums));
        int n=nums.length;
  //1,2,2  
   for(int i=0;i<n-1;){
       if(nums[i]!=nums[i+1])
           return nums[i];
       i=i+2;
   }
        
        return nums[n-1];
}
    
}