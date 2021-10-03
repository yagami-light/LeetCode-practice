class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList();
        for(int i=0;i<nums.length;i++){
            
            int index=Math.abs(nums[i]);
            
            int number=nums[index-1];
            if(number<0)
                result.add(index);
            nums[index-1]=-Math.abs(nums[index-1]);
        }
        
      
        
        return result;
    }
}