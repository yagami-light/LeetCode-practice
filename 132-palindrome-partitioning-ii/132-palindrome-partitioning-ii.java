class Solution {
    public int minCut(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        
        
        return helper(s,0,s.length()-1,dp);
    }
    
    private int helper(String str,int start,int end,int[][] dp){
        if(start>=end) return 0;
        if(isPalindrome(str,start,end)) {dp[start][end]=0;return dp[start][end];}
        if(dp[start][end]!=-1) return dp[start][end];
        int minCut=Integer.MAX_VALUE;
        for(int i=start;i<end;i++){
            int res=Integer.MAX_VALUE;
            if(isPalindrome(str,start,i)){
                res=1+helper(str,i+1,end,dp);
            }
            minCut=Math.min(minCut,res);
        }
        
        dp[start][end]=minCut;
        return dp[start][end];
        
    }
    
    
    private boolean isPalindrome(String str,int start,int end){
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    
}