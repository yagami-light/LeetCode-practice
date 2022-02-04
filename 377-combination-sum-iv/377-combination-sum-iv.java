class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        
//         int[] cache=new int[1001];
//         Arrays.fill(cache,-1);
        
//         return combSum4Util(nums,target,0,cache,0);
//         // return count[0];
        
        
        return combSum4(nums,target);
        
    }
    
    private int combSum4(int[] nums,int target){
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            
            for(int j=0;j<nums.length;j++){
                // System.out.println("woow");

                if(i-nums[j]>=0)
                    
                    dp[i]+=dp[i-nums[j]];
                
            }
            
            
            
        }
        
        return dp[target];
        
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