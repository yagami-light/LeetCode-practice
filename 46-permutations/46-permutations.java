class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        permute(nums,0,res);
        return res;
        
    }
    
    private void permute(int[] nums,int begin,List<List<Integer>> res){
        if(begin==nums.length){
            
            List<Integer> list=new ArrayList();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
                
            }
            res.add(new ArrayList(list));
            return;
            
            
        }
        
        
        for(int i=begin;i<nums.length;i++){
            System.out.println("before swapping "+Arrays.toString(nums));
            swap(nums,i,begin);
            System.out.println("after swapping "+Arrays.toString(nums));
            permute(nums,begin+1,res);
            swap(nums,i,begin);
        }
    }
    
    
    
    private void swap(int[] nums,int i,int j){
        // nums[i]=nums[i] ^ nums[j];
        // nums[j]=nums[i] ^ nums[j];
        // nums[i]=nums[i] ^ nums[j];
        
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
}