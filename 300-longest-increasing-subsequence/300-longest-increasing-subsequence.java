class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<n;i++){
            
            for(int j=0;j<i;j++){
                
                if(nums[j]<nums[i] && dp[i] <dp[j]+1 ){
                    dp[i]=dp[j]+1;
                    
                }
                
                
            }
            max=Math.max(max,dp[i]);
            
        }
        
        
        System.out.println(Arrays.toString(dp));
        
        
        return max;
        
        
    }
}