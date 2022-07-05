class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList();
        int subSetNum=1<<nums.length;
        
        for(int i=0;i<subSetNum;i++){
            List<Integer> list=new ArrayList();
            boolean illegal=false;
            
            for(int j=0;j<nums.length;j++){
                if((i>>j & 1) ==1){
                    if(j>0 && nums[j]==nums[j-1] &&(i>>(j-1)&1)==0){
                        
                        illegal=true;
                        break;
                        
                    }else{
                        list.add(nums[j]);
                    }
                    
                    
                    
                }
                
                
            }
            
            if(!illegal)
                result.add(list);
            
            
        }
        
        return result;
    }
}