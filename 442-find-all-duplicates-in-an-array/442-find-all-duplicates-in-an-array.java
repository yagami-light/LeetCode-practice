class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList();
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            int index=Math.abs(nums[i]);
            
            if(nums[index-1]<0){
                res.add(index);
            }
            
            nums[index-1]=-Math.abs(nums[index-1]);
            
            
        }
        
        return  res;
        
    }
}