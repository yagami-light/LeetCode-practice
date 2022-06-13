class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
         List<List<Integer>> res=new ArrayList();
        permute(nums,0,res);
        return res;
        
    }
    
    private void permute(int[] nums,int begin, List<List<Integer>> res){
        System.out.println("beging index "+begin);
        if(begin==nums.length){
            System.out.println("alex");
            
            List<Integer> temp=new ArrayList();
            for(int i=0;i<nums.length;i++){
                System.out.println("alaska");
                temp.add(nums[i]);
               
            }
             res.add(new ArrayList(temp));
            System.out.println("res is"+temp);
            return;
        }
        
        for(int i=begin;i<nums.length;i++){
            swap(nums,i,begin);
            permute(nums,begin+1,res);
            swap(nums,i,begin);
        }
        
    
        
        
    }
    
    
private void swap(int[] nums, int i, int begin) {
    int temp = nums[i];
    nums[i] = nums[begin];
    nums[begin] = temp;
}
    
    
}