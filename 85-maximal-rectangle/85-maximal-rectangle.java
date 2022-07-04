class Solution {
    public int maximalRectangle(char[][] matrix) {
      
        int numRow=matrix.length;
        int numCol=matrix[0].length;
        int[] heights=new int[numCol];
        int area=0;
        for(int row=0;row<numRow;row++){
            
            
            for(int col=0;col<numCol;col++){
                
                // heights[col]=matrix[row][col]=='1' ? (heights[col]+1) : 0;
                if (matrix[row][col] == '1') {
                heights[col] += 1;
            } else {
                heights[col] = 0;
            }
                
              
                
            }
              area=Math.max(area,getMaxrectagleArea(heights));
            
        }
        
        
        
        
        
        return area;
        
    }
    
    public int largestRectangleArea(int[] heights) {
    if (heights.length == 0) {
        return 0;
    }
    int[] leftLessMin = new int[heights.length];
    leftLessMin[0] = -1;
    for (int i = 1; i < heights.length; i++) {
        int l = i - 1;
        while (l >= 0 && heights[l] >= heights[i]) {
            l = leftLessMin[l];
        }
        leftLessMin[i] = l;
    }

    int[] rightLessMin = new int[heights.length];
    rightLessMin[heights.length - 1] = heights.length;
    for (int i = heights.length - 2; i >= 0; i--) {
        int r = i + 1;
        while (r <= heights.length - 1 && heights[r] >= heights[i]) {
            r = rightLessMin[r];
        }
        rightLessMin[i] = r;
    }
    int maxArea = 0;
    for (int i = 0; i < heights.length; i++) {
        int area = (rightLessMin[i] - leftLessMin[i] - 1) * heights[i];
        maxArea = Math.max(area, maxArea);
    }
    return maxArea;
}
    
    
    private int getMaxrectagleArea(int[] heights){
        System.out.println("heights print :"+Arrays.toString(heights));
        System.out.println("test");
        int n=heights.length;
        int[] minLeft=new int[n];
        int[] minRight=new int[n];
        int area=0;
         minLeft[0]=-1;
        for(int i=1;i<n;i++){
                    System.out.println("test2");

            int p=i-1;
            while(p>=0 && heights[p]>=heights[i])
                p=minLeft[p];
            
            minLeft[i]=p;
            
        }
        minRight[n-1]=n;
        
        for(int i=n-2;i>=0;i--){
                    System.out.println("test3");

            int p=i+1;
            while(p<n && heights[p] >= heights[i])
                p=minRight[p];
            
            minRight[i]=p;
            
            
            
        }
       
        
        for(int i=0;i<n;i++){
            
            area=Math.max(area,heights[i]*(minRight[i]-minLeft[i]-1));
            
            
        }
        
        return area;
        
    }
    
    
}