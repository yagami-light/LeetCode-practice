class Solution {
    public int countVowelStrings(int n) {
        int[] dp=new int[6];
        Arrays.fill(dp,1);
        dp[5]=0;
        
        for(int i=0;i<n;i++){
            // System.out.println(Arrays.toString(dp));

            int sum=0;
            for(int j=dp.length-2;j>=0;j--){
                
                sum=sum+dp[j];
                dp[j]=sum;
                
            }
            
            
        }
        
        
        return dp[0];
        
    }
}