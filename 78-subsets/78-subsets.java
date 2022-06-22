class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        
        res.add(new ArrayList());
        
        for(int i=0;i<nums.length;i++){
             List<List<Integer>> tempList=new ArrayList();
            
            for(List<Integer> list:res){
                List<Integer> temp=new ArrayList(list);
                temp.add(nums[i]);
                tempList.add(temp);
            }
            res.addAll(tempList);
        }
        
        
        return res;
        
        
    }
}