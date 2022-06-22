class Solution {
    
    // combine(n,k)=combine(n-1,k-1) + combine(n-1,k)
    
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>[][] dp=new List[n+1][k+1];
        
        
        for(int i=0;i<=n;i++){
            dp[i][0]=new ArrayList();
            dp[i][0].add(new ArrayList());
        }
        
        for(int i=1;i<=n;i++){
            
            
            for(int j=1;j<=i && j<=k;j++){
                
                
                dp[i][j]=new ArrayList();
                if(i>j)
                dp[i][j].addAll(dp[i-1][j]);
                
                for(List<Integer> list:dp[i-1][j-1]){
                    
                    List<Integer> temp=new ArrayList(list);
                    temp.add(i);
                    dp[i][j].add(temp);
                    
                }
                
            }
            
        }
        
        
        return dp[n][k];
        
        
        
    }
}