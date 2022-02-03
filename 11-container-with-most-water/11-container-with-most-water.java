class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length;
        int start=0;
        int end=n-1;
        int max=Integer.MIN_VALUE;
        int minHeight=Integer.MAX_VALUE;
        while(start<end){
            
            minHeight=Math.min(height[end],height[start]);
            
            
            max=Math.max(max,minHeight*(end-start));
            
            if(height[end]<height[start])
                end--;
            else
                start++;
            
        }
        
        
        return max;
        
        
    }
}