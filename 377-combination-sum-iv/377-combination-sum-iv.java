class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        
        int[] cache=new int[1001];
        Arrays.fill(cache,-1);
        
        return combSum4Util(nums,target,0,cache,0);
        // return count[0];
        
    }
    
    
    private int combSum4Util(int[] nums,int target,int currSum,int cache[],int index){
        if(index>= nums.length)
            return 0;
        // System.out.println(currSum);
        int count=0;
        if(target == 0){
           return 1;
        }
        
       
        
        if(target < 0)
            return 0;
        
         if(cache[target]!=-1)
            return cache[target];
        
       for(int i=0;i<nums.length;i++){
            
            count+=combSum4Util(nums,target-nums[i],currSum,cache,i);
        }
        
        cache[target]= count;
        return cache[target];
        
        
    }
    
    
}