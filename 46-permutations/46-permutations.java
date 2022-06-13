class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res=new ArrayList();
        res.add(new ArrayList());
        
        for(int i=0;i<nums.length;i++){
            
            int currSize=res.size();
            for(int j=0;j<currSize;j++){
                
                for(int k=0;k<=i;k++){
                List<Integer> tempList=new ArrayList(res.get(j));
                tempList.add(k,nums[i]);
                
                res.add(tempList);
                }
                
            }
            
            for(int k=0;k<currSize;k++) res.remove(0);
            
            
        }
        return res;
    }
}