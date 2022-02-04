class Solution {
    public int uniquePaths(int m, int n) {
        Map<Pair<Integer,Integer>,Integer> cache=new HashMap();
        return unqieuePath(m,n,0,0,cache);
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
    
    
    
}