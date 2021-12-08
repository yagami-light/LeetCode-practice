class Solution {
    
       public  int climbStairs(int n) {
        int[] cache=new int[46];
        return climbStairsUtil(n,cache);
        
        
    }
    
    
    private int climbStairsUtil(int n,int[] cache) {
        if(cache[n]!=0)
            return cache[n];
        
        if(n==0 || n==1 || n==2)
            return n;
        
        cache[n]= climbStairsUtil(n-1,cache)+climbStairsUtil(n-2,cache);
        return cache[n];
        
    }
}