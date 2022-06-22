class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res=new ArrayList();
        int bit_length=nums.length;
        int ans_length=1 << bit_length;
        
        for(int i=0;i<ans_length;i++){
            
            List<Integer> temp=new ArrayList();
            int count=0;
            int i_copy=i;
            while(i_copy!=0){
                if((i_copy & 1) ==1){
                    temp.add(nums[count]);
                }
                count++;
                i_copy=i_copy >>1;
            }
            res.add(temp);
            
        }
        
        return res;
        
    }
}