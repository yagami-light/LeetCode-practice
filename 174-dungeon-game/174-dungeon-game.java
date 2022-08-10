class Solution {
    Map<String,Integer> cache=new HashMap();
    public int calculateMinimumHP(int[][] nums) {
        
        
        return helper(nums,0,0);
        
    }
    
    private int helper(int[][] nums,int i,int j){
        
        int m=nums.length;
        int n=nums[0].length;
        
        if(i==m || j==n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1) return nums[i][j]<0 ? -nums[i][j]+1 : 1;
        String key=i+"@"+j;
        if(cache.containsKey(key)) return cache.get(key);
        
        int minDown=helper(nums,i+1,j);
        int minRight=helper(nums,i,j+1);
        
        int minHealthRequired=Math.min(minDown,minRight)-nums[i][j];
        
        int res= minHealthRequired<=0 ? 1 : minHealthRequired;
        
        cache.put(key,res);
        return res;
        
    }
    
}