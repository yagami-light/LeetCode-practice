class Solution {
    public int largestRectangleArea(int[] heights) {
        
        return largestRectangleArea(heights,0,heights.length-1);
    }
    
    private int largestRectangleArea(int[] heights,int start,int end){
        if(start==end)
            return heights[start];
        
        int mid=(start+end)/2;
        
        int left=largestRectangleArea(heights,start,mid);
        int right=largestRectangleArea(heights,mid+1,end);
        int middleArea=largestRectangleAreaMid(heights,start,mid,end);
        
        
        return Math.max(Math.max(left,right),middleArea);
        
    }
    
    
    private int largestRectangleAreaMid(int[] heights,int start,int mid,int end){
        int i=mid;
        int j=mid+1;
        
        int minHeight=Math.min(heights[i],heights[j]);
        int minArea=2*minHeight;
        
        while(i>=start  && j<=end){
            minHeight=Math.min(minHeight,Math.min(heights[i],heights[j]));
            minArea=Math.max(minArea,minHeight * (j-i+1));
            if(i==start)
                j++;
            else if(j==end){
                i--;
            }
            else if(heights[i-1] > heights[j+1]){
                i--;
            }else
                j++;
            
        }
        return minArea;
        
        
        
        
    }
    
    
    
    
}