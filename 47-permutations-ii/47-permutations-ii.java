class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>>  res=new ArrayList();
        permute(nums,0,res);
        return res;
        
        
    }
    
    private void permute(int[] nums,int begin, List<List<Integer>>  res){
        if(begin==nums.length){
        
            List<Integer> tempList=new ArrayList();
            
            for(int i=0;i<nums.length;i++){
                tempList.add(nums[i]);
            }
            
            res.add(tempList);
            return;
        }
        Set<Integer> set=new HashSet();
        
        for(int i=begin;i<nums.length;i++){
            // if(nums[i]==nums[begin] && i!=begin) continue;
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums,i,begin);
            permute(nums,begin+1,res);
            swap(nums,i,begin);
        }
        
        
        
    }
    
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
}