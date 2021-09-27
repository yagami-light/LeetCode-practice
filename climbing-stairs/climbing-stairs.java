class Solution {
    public int climbStairs(int n) {
        int[] cache=new int[46];
        return climbSUtil(n,cache);
    }
    
    public int climbSUtil(int n,int[] cache){
        if(cache[n]!=0) return cache[n];
        if(n==0|| n==1 || n==2)
            return n;
        
        int val= climbSUtil(n-1,cache)+climbSUtil(n-2,cache);
        cache[n]=val;
        return cache[n];
    }
    
}