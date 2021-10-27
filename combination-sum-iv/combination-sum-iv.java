class Solution {
    public int combinationSum4(int[] nums, int target) {
        // int[] result=new int[1];
        Map<Integer,Integer> map=new HashMap();
        return combinationSum4Util(nums,target,map);
        
    }
    
    
    private int combinationSum4Util(int[] nums,int target,Map<Integer,Integer> map){
        // System.out.println("curr SUm "+target);
        if(target==0){
           
            return 1;
        }
        if(target<0)
            return 0;
        if(map.get(target)!=null) return map.get(target);
      
        int res=0;
        for(int i=0;i<nums.length;i++){
        
            res+=combinationSum4Util(nums,target-nums[i],map);
            
        }
        
        map.put(target,res);
        return map.get(target);
        
        
    }
    
}