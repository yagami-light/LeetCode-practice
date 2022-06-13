class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        
        
        permute(nums,new ArrayList(),res,0);
        System.out.println(res);
        
        return res;
        
    }
    
    private void permute(int[] nums,List<Integer> currList,List<List<Integer>> res,int index){

        // if(index>=nums.length) return;
        if(currList.size()==nums.length){
            res.add(new ArrayList(currList));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(currList.contains(nums[i])) continue;
            currList.add(nums[i]);
            
                            // System.out.println("alex 2"+currList);

            permute(nums,currList,res,i);
            currList.remove(currList.size()-1);
        }
        
        
    }
    
}