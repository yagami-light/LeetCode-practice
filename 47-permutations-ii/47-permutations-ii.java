class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> res=new ArrayList();
        Arrays.sort(nums);
        boolean[] found=new boolean[nums.length];
        permute(nums,new ArrayList(),res,found);
        
        return res;
        
    }
    
    private void permute(int[] nums,List<Integer> currList,List<List<Integer>> res,boolean[] found){
        
        if(nums.length==currList.size()){
            res.add(new ArrayList(currList));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            // if(nums[i]==-100) continue;
            if(found[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && found[i-1]==true) continue;
            found[i]=true;
            currList.add(nums[i]);
            int temp=nums[i];
            // nums[i]=-100;
            permute(nums,currList,res,found);
            currList.remove(currList.size()-1);
            found[i]=false;
            // nums[i]=temp;
            
        }
        
        
    }
    
    
}