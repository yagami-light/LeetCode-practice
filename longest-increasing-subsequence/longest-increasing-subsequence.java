class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                
                if(nums[j]<nums[i] && (dp[i] <= (dp[j]+1))){
                    dp[i]=dp[j]+1;
                }
                
                
            }
        }
        
        
        
        return Arrays.stream(dp).max().getAsInt();
        
        
        
    }
}


//1,2,1,1,1,1
