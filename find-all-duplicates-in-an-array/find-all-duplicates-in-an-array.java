class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList();
     for(int i=0;i<n;i++){
         
         int curr=Math.abs(nums[i]);
         if(nums[curr-1]<0)
             list.add(curr);
         nums[curr-1]=-Math.abs(nums[curr-1]);
         
         
     }
        
     return list;   
        
        
    }
}