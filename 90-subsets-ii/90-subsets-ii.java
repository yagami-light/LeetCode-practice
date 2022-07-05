class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList();
        ans.add(new ArrayList());
        
        Arrays.sort(nums);
        int start=1;
        for(int i=0;i<nums.length;i++){
            
            List<List<Integer>> temp_list=new ArrayList();
            
            for(int j=0;j<ans.size();j++){
                
                List<Integer> list=ans.get(j);
                if(i>0 && nums[i]==nums[i-1] && j<start) continue;
                
                List<Integer> temp=new ArrayList(list);
                
                temp.add(nums[i]);
                temp_list.add(temp);
            }
                        start=ans.size();

            ans.addAll(temp_list);
            
        }
        
        
        return ans;
        
        
        
    }
}