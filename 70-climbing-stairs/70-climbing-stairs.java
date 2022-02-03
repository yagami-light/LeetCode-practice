class Solution {
    public int climbStairs(int n) {
        
//         if(n==0 || n==1|| n==2)
//             return n;
        
//         return climbStairs(n-1)+climbStairs(n-2);
        
        
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            if(i<=2)
                dp[i]=i;
            else
                dp[i]=dp[i-2]+dp[i-1];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
        
        
    }
}