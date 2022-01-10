class Solution {
    public int uniquePaths(int m, int n) {
        int[] count=new int[1];
        Map<Pair<Integer,Integer>,Integer> cache=new HashMap();
        return uniquePathsUtil(m,n,0,0,count,cache);
    }
    
    
    private int uniquePathsUtil(int m, int n,int i,int j,int[] count,Map<Pair<Integer,Integer>,Integer> cache){
        
        if(i==m-1 && j==n-1)
            return 1;
        if(i>=m || j>=n)
            return 0;
        
        if(cache.get(new Pair(i,j))!=null)
            return cache.get(new Pair(i,j));
        
        count[0]=uniquePathsUtil(m,n,i+1,j,count,cache)+uniquePathsUtil(m,n,i,j+1,count,cache);
        
        cache.put(new Pair(i,j), count[0]);
        
        return cache.get(new Pair(i,j));
        
        
        
    }
    
    
}