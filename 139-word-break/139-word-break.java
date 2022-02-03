class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        
        for(int i=1;i<=n;i++){
            
            for(int j=0;j<i;j++){
                
                
                String subString=s.substring(j,i);
                // System.out.println("index j "+j+" index i "+i+" "+subString);
                if(dp[j] && wordDict.contains(subString))
                    dp[i]=true;
                
                
                
            }
            
        }
        
        
        return dp[n];
        
        
    }
}