class Solution {
    public int uniquePaths(int m, int n) {
        // Map<Pair<Integer,Integer>,Integer> cache=new HashMap();
        // return unqieuePath(m,n,0,0,cache);
        
        return unqieuePathDp(m,n); 
    }
    
    
    private int unqieuePath(int m,int n,int i,int j,Map<Pair<Integer,Integer>,Integer> cache){
        
        if(i==m-1 && j==n-1)
            return 1;
        if(i>=m || j>=n)
            return 0;
        
        if(cache.get(new Pair(i,j))!=null)
            return cache.get(new Pair(i,j));
        
        
        int count=unqieuePath(m,n,i+1,j,cache)+unqieuePath(m,n,i,j+1,cache);
        
        cache.put(new Pair(i,j),count);
        return count;
        
        
        
    }
    
    
    private int unqieuePathDp(int m ,int n){
        
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            
            
            for(int j=0;j<n;j++){
                if(i==0 && j==0)
                    dp[i][j]=1;
                else if(j==0)
                    dp[i][j]=dp[i-1][j];
                else if(i==0)
                    dp[i][j]=dp[i][j-1];
                else
                    
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                
                
            }
            
        }
        
        return dp[m-1][n-1];
        
        
        
        
        
    }
    
    
    
}