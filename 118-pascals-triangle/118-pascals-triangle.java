class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        int[][] dp=new int[n][n];
        List<List<Integer>> result=new ArrayList();
        
        for(int i=0;i<n;i++){
            // if(i==1)
            List<Integer> list=new ArrayList();
            for(int j=0;j<=i;j++){
                
                if(j==0)
                    dp[i][j]=1;
                else if(i==j)
                    dp[i][j]=1;
                else
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                
                list.add(dp[i][j]);
                
                
            }
            
            result.add(list);
            
        }
        
        return result;
        
        
    }
}