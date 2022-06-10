class Solution {
    public int trap(int[] height) {
        
        int ans=0;
        int n=height.length;
        
        int[] leftMax=new int[n];
        int[] maxRight=new int[n];
        
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
        }
        
        for(int i=height.length-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],height[i+1]);
        }
        
        for(int i=0;i<height.length;i++){
            if(Math.min(leftMax[i],maxRight[i])-height[i] <0) continue;
            ans+=Math.min(leftMax[i],maxRight[i])-height[i];
        }
        
        return ans;
        
   
        
        
    }
}