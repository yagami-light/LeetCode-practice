class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        
        Arrays.fill(dp,1);
        
        
        for(int i=1;i<n;i++){
            
            for(int j=i-1;j<i;j++){
                
                
                if(nums[i]>nums[j] && dp[i]<dp[j]+1){
                    
                    dp[i]=dp[j]+1;
                }
                
                
            }
            
        }
        
        
        System.out.println(Arrays.toString(dp));
        return Arrays.stream(dp).max().getAsInt();
        
    }
}